package com.entity.model;

import com.entity.FahuoaddressEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 发货地址
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FahuoaddressModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 创建用户
     */
    private Integer yonghuId;


    /**
     * 发货人
     */
    private String fahuoaddressName;


    /**
     * 发货电话
     */
    private String fahuoaddressPhone;


    /**
     * 发货地址
     */
    private String fahuoaddressDizhi;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 修改时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date updateTime;


    /**
     * 创建时间
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
	 * 获取：创建用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：创建用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：发货人
	 */
    public String getFahuoaddressName() {
        return fahuoaddressName;
    }


    /**
	 * 设置：发货人
	 */
    public void setFahuoaddressName(String fahuoaddressName) {
        this.fahuoaddressName = fahuoaddressName;
    }
    /**
	 * 获取：发货电话
	 */
    public String getFahuoaddressPhone() {
        return fahuoaddressPhone;
    }


    /**
	 * 设置：发货电话
	 */
    public void setFahuoaddressPhone(String fahuoaddressPhone) {
        this.fahuoaddressPhone = fahuoaddressPhone;
    }
    /**
	 * 获取：发货地址
	 */
    public String getFahuoaddressDizhi() {
        return fahuoaddressDizhi;
    }


    /**
	 * 设置：发货地址
	 */
    public void setFahuoaddressDizhi(String fahuoaddressDizhi) {
        this.fahuoaddressDizhi = fahuoaddressDizhi;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：修改时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 设置：修改时间
	 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
