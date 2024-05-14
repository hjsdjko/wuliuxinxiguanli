package com.entity.model;

import com.entity.DingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DingdanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单号
     */
    private String dingdanUuidNumber;


    /**
     * 运输物品名称
     */
    private String shangpinName;


    /**
     * 运输物品类型
     */
    private Integer shangpinTypes;


    /**
     * 运输物品详情
     */
    private String yunshuContent;


    /**
     * 发货地址
     */
    private Integer fahuoaddressId;


    /**
     * 收货地址
     */
    private Integer shouhuoaddressId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 运货路线
     */
    private Integer yunhuoluxianId;


    /**
     * 订单状态
     */
    private Integer dingdanTypes;


    /**
     * 订单添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 逻辑删除
     */
    private Integer dingdanDelete;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：订单号
	 */
    public String getDingdanUuidNumber() {
        return dingdanUuidNumber;
    }


    /**
	 * 设置：订单号
	 */
    public void setDingdanUuidNumber(String dingdanUuidNumber) {
        this.dingdanUuidNumber = dingdanUuidNumber;
    }
    /**
	 * 获取：运输物品名称
	 */
    public String getShangpinName() {
        return shangpinName;
    }


    /**
	 * 设置：运输物品名称
	 */
    public void setShangpinName(String shangpinName) {
        this.shangpinName = shangpinName;
    }
    /**
	 * 获取：运输物品类型
	 */
    public Integer getShangpinTypes() {
        return shangpinTypes;
    }


    /**
	 * 设置：运输物品类型
	 */
    public void setShangpinTypes(Integer shangpinTypes) {
        this.shangpinTypes = shangpinTypes;
    }
    /**
	 * 获取：运输物品详情
	 */
    public String getYunshuContent() {
        return yunshuContent;
    }


    /**
	 * 设置：运输物品详情
	 */
    public void setYunshuContent(String yunshuContent) {
        this.yunshuContent = yunshuContent;
    }
    /**
	 * 获取：发货地址
	 */
    public Integer getFahuoaddressId() {
        return fahuoaddressId;
    }


    /**
	 * 设置：发货地址
	 */
    public void setFahuoaddressId(Integer fahuoaddressId) {
        this.fahuoaddressId = fahuoaddressId;
    }
    /**
	 * 获取：收货地址
	 */
    public Integer getShouhuoaddressId() {
        return shouhuoaddressId;
    }


    /**
	 * 设置：收货地址
	 */
    public void setShouhuoaddressId(Integer shouhuoaddressId) {
        this.shouhuoaddressId = shouhuoaddressId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：运货路线
	 */
    public Integer getYunhuoluxianId() {
        return yunhuoluxianId;
    }


    /**
	 * 设置：运货路线
	 */
    public void setYunhuoluxianId(Integer yunhuoluxianId) {
        this.yunhuoluxianId = yunhuoluxianId;
    }
    /**
	 * 获取：订单状态
	 */
    public Integer getDingdanTypes() {
        return dingdanTypes;
    }


    /**
	 * 设置：订单状态
	 */
    public void setDingdanTypes(Integer dingdanTypes) {
        this.dingdanTypes = dingdanTypes;
    }
    /**
	 * 获取：订单添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getDingdanDelete() {
        return dingdanDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setDingdanDelete(Integer dingdanDelete) {
        this.dingdanDelete = dingdanDelete;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
