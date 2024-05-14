
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
 * 发货地址
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/fahuoaddress")
public class FahuoaddressController {
    private static final Logger logger = LoggerFactory.getLogger(FahuoaddressController.class);

    @Autowired
    private FahuoaddressService fahuoaddressService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private YonghuService yonghuService;



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
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = fahuoaddressService.queryPage(params);

        //字典表数据转换
        List<FahuoaddressView> list =(List<FahuoaddressView>)page.getList();
        for(FahuoaddressView c:list){
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
        FahuoaddressEntity fahuoaddress = fahuoaddressService.selectById(id);
        if(fahuoaddress !=null){
            //entity转view
            FahuoaddressView view = new FahuoaddressView();
            BeanUtils.copyProperties( fahuoaddress , view );//把实体数据重构到view中

                //级联表
                YonghuEntity yonghu = yonghuService.selectById(fahuoaddress.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
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
    public R save(@RequestBody FahuoaddressEntity fahuoaddress, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,fahuoaddress:{}",this.getClass().getName(),fahuoaddress.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            fahuoaddress.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<FahuoaddressEntity> queryWrapper = new EntityWrapper<FahuoaddressEntity>()
            .eq("yonghu_id", fahuoaddress.getYonghuId())
            .eq("fahuoaddress_name", fahuoaddress.getFahuoaddressName())
            .eq("fahuoaddress_phone", fahuoaddress.getFahuoaddressPhone())
            .eq("fahuoaddress_dizhi", fahuoaddress.getFahuoaddressDizhi())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        FahuoaddressEntity fahuoaddressEntity = fahuoaddressService.selectOne(queryWrapper);
        if(fahuoaddressEntity==null){
            fahuoaddress.setInsertTime(new Date());
            fahuoaddress.setCreateTime(new Date());
            fahuoaddressService.insert(fahuoaddress);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody FahuoaddressEntity fahuoaddress, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,fahuoaddress:{}",this.getClass().getName(),fahuoaddress.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            fahuoaddress.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<FahuoaddressEntity> queryWrapper = new EntityWrapper<FahuoaddressEntity>()
            .notIn("id",fahuoaddress.getId())
            .andNew()
            .eq("yonghu_id", fahuoaddress.getYonghuId())
            .eq("fahuoaddress_name", fahuoaddress.getFahuoaddressName())
            .eq("fahuoaddress_phone", fahuoaddress.getFahuoaddressPhone())
            .eq("fahuoaddress_dizhi", fahuoaddress.getFahuoaddressDizhi())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        FahuoaddressEntity fahuoaddressEntity = fahuoaddressService.selectOne(queryWrapper);
        fahuoaddress.setUpdateTime(new Date());
        if(fahuoaddressEntity==null){
            fahuoaddressService.updateById(fahuoaddress);//根据id更新
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
        fahuoaddressService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<FahuoaddressEntity> fahuoaddressList = new ArrayList<>();//上传的东西
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
                            FahuoaddressEntity fahuoaddressEntity = new FahuoaddressEntity();
//                            fahuoaddressEntity.setYonghuId(Integer.valueOf(data.get(0)));   //创建用户 要改的
//                            fahuoaddressEntity.setFahuoaddressName(data.get(0));                    //发货人 要改的
//                            fahuoaddressEntity.setFahuoaddressPhone(data.get(0));                    //发货电话 要改的
//                            fahuoaddressEntity.setFahuoaddressDizhi(data.get(0));                    //发货地址 要改的
//                            fahuoaddressEntity.setInsertTime(date);//时间
//                            fahuoaddressEntity.setUpdateTime(new Date(data.get(0)));          //修改时间 要改的
//                            fahuoaddressEntity.setCreateTime(date);//时间
                            fahuoaddressList.add(fahuoaddressEntity);


                            //把要查询是否重复的字段放入map中
                                //发货电话
                                if(seachFields.containsKey("fahuoaddressPhone")){
                                    List<String> fahuoaddressPhone = seachFields.get("fahuoaddressPhone");
                                    fahuoaddressPhone.add(data.get(0));//要改的
                                }else{
                                    List<String> fahuoaddressPhone = new ArrayList<>();
                                    fahuoaddressPhone.add(data.get(0));//要改的
                                    seachFields.put("fahuoaddressPhone",fahuoaddressPhone);
                                }
                        }

                        //查询是否重复
                         //发货电话
                        List<FahuoaddressEntity> fahuoaddressEntities_fahuoaddressPhone = fahuoaddressService.selectList(new EntityWrapper<FahuoaddressEntity>().in("fahuoaddress_phone", seachFields.get("fahuoaddressPhone")));
                        if(fahuoaddressEntities_fahuoaddressPhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(FahuoaddressEntity s:fahuoaddressEntities_fahuoaddressPhone){
                                repeatFields.add(s.getFahuoaddressPhone());
                            }
                            return R.error(511,"数据库的该表中的 [发货电话] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        fahuoaddressService.insertBatch(fahuoaddressList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
