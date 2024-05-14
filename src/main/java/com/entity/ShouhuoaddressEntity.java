package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 收货地址
 *
 * @author 
 * @email
 */
@TableName("shouhuoaddress")
public class ShouhuoaddressEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShouhuoaddressEntity() {

	}

	public ShouhuoaddressEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 创建用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 收货人
     */
    @TableField(value = "shouhuoaddress_name")

    private String shouhuoaddressName;


    /**
     * 收货电话
     */
    @TableField(value = "shouhuoaddress_phone")

    private String shouhuoaddressPhone;


    /**
     * 收货地址
     */
    @TableField(value = "shouhuoaddress_dizhi")

    private String shouhuoaddressDizhi;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 修改时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "update_time",fill = FieldFill.UPDATE)

    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：创建用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：创建用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：收货人
	 */
    public String getShouhuoaddressName() {
        return shouhuoaddressName;
    }


    /**
	 * 获取：收货人
	 */

    public void setShouhuoaddressName(String shouhuoaddressName) {
        this.shouhuoaddressName = shouhuoaddressName;
    }
    /**
	 * 设置：收货电话
	 */
    public String getShouhuoaddressPhone() {
        return shouhuoaddressPhone;
    }


    /**
	 * 获取：收货电话
	 */

    public void setShouhuoaddressPhone(String shouhuoaddressPhone) {
        this.shouhuoaddressPhone = shouhuoaddressPhone;
    }
    /**
	 * 设置：收货地址
	 */
    public String getShouhuoaddressDizhi() {
        return shouhuoaddressDizhi;
    }


    /**
	 * 获取：收货地址
	 */

    public void setShouhuoaddressDizhi(String shouhuoaddressDizhi) {
        this.shouhuoaddressDizhi = shouhuoaddressDizhi;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：修改时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 获取：修改时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shouhuoaddress{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", shouhuoaddressName=" + shouhuoaddressName +
            ", shouhuoaddressPhone=" + shouhuoaddressPhone +
            ", shouhuoaddressDizhi=" + shouhuoaddressDizhi +
            ", insertTime=" + insertTime +
            ", updateTime=" + updateTime +
            ", createTime=" + createTime +
        "}";
    }
}
