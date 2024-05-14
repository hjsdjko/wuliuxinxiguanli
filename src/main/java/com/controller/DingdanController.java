
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 订单
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/dingdan")
public class DingdanController {
    private static final Logger logger = LoggerFactory.getLogger(DingdanController.class);

    @Autowired
    private DingdanService dingdanService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private FahuoaddressService fahuoaddressService;
    @Autowired
    private ShouhuoaddressService shouhuoaddressService;
    @Autowired
    private YonghuService yonghuService;
    @Autowired
    private YunhuoluxianService yunhuoluxianService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("dingdanDeleteStart",1);params.put("dingdanDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = dingdanService.queryPage(params);

        //字典表数据转换
        List<DingdanView> list =(List<DingdanView>)page.getList();
        for(DingdanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        DingdanEntity dingdan = dingdanService.selectById(id);
        if(dingdan !=null){
            //entity转view
            DingdanView view = new DingdanView();
            BeanUtils.copyProperties( dingdan , view );//把实体数据重构到view中

                //级联表
                FahuoaddressEntity fahuoaddress = fahuoaddressService.selectById(dingdan.getFahuoaddressId());
                if(fahuoaddress != null){
                    BeanUtils.copyProperties( fahuoaddress , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setFahuoaddressId(fahuoaddress.getId());
                    view.setFahuoaddressYonghuId(fahuoaddress.getYonghuId());
                }
                //级联表
                ShouhuoaddressEntity shouhuoaddress = shouhuoaddressService.selectById(dingdan.getShouhuoaddressId());
                if(shouhuoaddress != null){
                    BeanUtils.copyProperties( shouhuoaddress , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setShouhuoaddressId(shouhuoaddress.getId());
                    view.setShouhuoaddressYonghuId(shouhuoaddress.getYonghuId());
                }
                //级联表
                YonghuEntity yonghu = yonghuService.selectById(dingdan.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //级联表
                YunhuoluxianEntity yunhuoluxian = yunhuoluxianService.selectById(dingdan.getYunhuoluxianId());
                if(yunhuoluxian != null){
                    BeanUtils.copyProperties( yunhuoluxian , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYunhuoluxianId(yunhuoluxian.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody DingdanEntity dingdan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,dingdan:{}",this.getClass().getName(),dingdan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            dingdan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<DingdanEntity> queryWrapper = new EntityWrapper<DingdanEntity>()
            .eq("dingdan_uuid_number", dingdan.getDingdanUuidNumber())
            .eq("shangpin_name", dingdan.getShangpinName())
            .eq("shangpin_types", dingdan.getShangpinTypes())
            .eq("fahuoaddress_id", dingdan.getFahuoaddressId())
            .eq("shouhuoaddress_id", dingdan.getShouhuoaddressId())
            .eq("yonghu_id", dingdan.getYonghuId())
            .eq("yunhuoluxian_id", dingdan.getYunhuoluxianId())
            .eq("dingdan_types", dingdan.getDingdanTypes())
            .eq("dingdan_delete", dingdan.getDingdanDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DingdanEntity dingdanEntity = dingdanService.selectOne(queryWrapper);
        if(dingdanEntity==null){
            dingdan.setInsertTime(new Date());
            dingdan.setDingdanDelete(1);
            dingdan.setCreateTime(new Date());
            dingdanService.insert(dingdan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody DingdanEntity dingdan, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,dingdan:{}",this.getClass().getName(),dingdan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            dingdan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<DingdanEntity> queryWrapper = new EntityWrapper<DingdanEntity>()
            .notIn("id",dingdan.getId())
            .andNew()
            .eq("dingdan_uuid_number", dingdan.getDingdanUuidNumber())
            .eq("shangpin_name", dingdan.getShangpinName())
            .eq("shangpin_types", dingdan.getShangpinTypes())
            .eq("fahuoaddress_id", dingdan.getFahuoaddressId())
            .eq("shouhuoaddress_id", dingdan.getShouhuoaddressId())
            .eq("yonghu_id", dingdan.getYonghuId())
            .eq("yunhuoluxian_id", dingdan.getYunhuoluxianId())
            .eq("dingdan_types", dingdan.getDingdanTypes())
            .eq("dingdan_delete", dingdan.getDingdanDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DingdanEntity dingdanEntity = dingdanService.selectOne(queryWrapper);
        if(dingdanEntity==null){
            dingdanService.updateById(dingdan);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<DingdanEntity> list = new ArrayList<>();
        for(Integer id:ids){
            DingdanEntity dingdanEntity = new DingdanEntity();
            dingdanEntity.setId(id);
            dingdanEntity.setDingdanDelete(2);
            list.add(dingdanEntity);
        }
        if(list != null && list.size() >0){
            dingdanService.updateBatchById(list);
        }
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<DingdanEntity> dingdanList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            DingdanEntity dingdanEntity = new DingdanEntity();
//                            dingdanEntity.setDingdanUuidNumber(data.get(0));                    //订单号 要改的
//                            dingdanEntity.setShangpinName(data.get(0));                    //运输物品名称 要改的
//                            dingdanEntity.setShangpinTypes(Integer.valueOf(data.get(0)));   //运输物品类型 要改的
//                            dingdanEntity.setYunshuContent("");//照片
//                            dingdanEntity.setFahuoaddressId(Integer.valueOf(data.get(0)));   //发货地址 要改的
//                            dingdanEntity.setShouhuoaddressId(Integer.valueOf(data.get(0)));   //收货地址 要改的
//                            dingdanEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            dingdanEntity.setYunhuoluxianId(Integer.valueOf(data.get(0)));   //运货路线 要改的
//                            dingdanEntity.setDingdanTypes(Integer.valueOf(data.get(0)));   //订单状态 要改的
//                            dingdanEntity.setInsertTime(date);//时间
//                            dingdanEntity.setDingdanDelete(1);//逻辑删除字段
//                            dingdanEntity.setCreateTime(date);//时间
                            dingdanList.add(dingdanEntity);


                            //把要查询是否重复的字段放入map中
                                //订单号
                                if(seachFields.containsKey("dingdanUuidNumber")){
                                    List<String> dingdanUuidNumber = seachFields.get("dingdanUuidNumber");
                                    dingdanUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> dingdanUuidNumber = new ArrayList<>();
                                    dingdanUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("dingdanUuidNumber",dingdanUuidNumber);
                                }
                        }

                        //查询是否重复
                         //订单号
                        List<DingdanEntity> dingdanEntities_dingdanUuidNumber = dingdanService.selectList(new EntityWrapper<DingdanEntity>().in("dingdan_uuid_number", seachFields.get("dingdanUuidNumber")).eq("dingdan_delete", 1));
                        if(dingdanEntities_dingdanUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(DingdanEntity s:dingdanEntities_dingdanUuidNumber){
                                repeatFields.add(s.getDingdanUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [订单号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        dingdanService.insertBatch(dingdanList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
