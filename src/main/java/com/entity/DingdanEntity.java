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
 * 订单
 *
 * @author 
 * @email
 */
@TableName("dingdan")
public class DingdanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DingdanEntity() {

	}

	public DingdanEntity(T t) {
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
     * 订单号
     */
    @TableField(value = "dingdan_uuid_number")

    private String dingdanUuidNumber;


    /**
     * 运输物品名称
     */
    @TableField(value = "shangpin_name")

    private String shangpinName;


    /**
     * 运输物品类型
     */
    @TableField(value = "shangpin_types")

    private Integer shangpinTypes;


    /**
     * 运输物品详情
     */
    @TableField(value = "yunshu_content")

    private String yunshuContent;


    /**
     * 发货地址
     */
    @TableField(value = "fahuoaddress_id")

    private Integer fahuoaddressId;


    /**
     * 收货地址
     */
    @TableField(value = "shouhuoaddress_id")

    private Integer shouhuoaddressId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 运货路线
     */
    @TableField(value = "yunhuoluxian_id")

    private Integer yunhuoluxianId;


    /**
     * 订单状态
     */
    @TableField(value = "dingdan_types")

    private Integer dingdanTypes;


    /**
     * 订单添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 逻辑删除
     */
    @TableField(value = "dingdan_delete")

    private Integer dingdanDelete;


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
	 * 设置：订单号
	 */
    public String getDingdanUuidNumber() {
        return dingdanUuidNumber;
    }


    /**
	 * 获取：订单号
	 */

    public void setDingdanUuidNumber(String dingdanUuidNumber) {
        this.dingdanUuidNumber = dingdanUuidNumber;
    }
    /**
	 * 设置：运输物品名称
	 */
    public String getShangpinName() {
        return shangpinName;
    }


    /**
	 * 获取：运输物品名称
	 */

    public void setShangpinName(String shangpinName) {
        this.shangpinName = shangpinName;
    }
    /**
	 * 设置：运输物品类型
	 */
    public Integer getShangpinTypes() {
        return shangpinTypes;
    }


    /**
	 * 获取：运输物品类型
	 */

    public void setShangpinTypes(Integer shangpinTypes) {
        this.shangpinTypes = shangpinTypes;
    }
    /**
	 * 设置：运输物品详情
	 */
    public String getYunshuContent() {
        return yunshuContent;
    }


    /**
	 * 获取：运输物品详情
	 */

    public void setYunshuContent(String yunshuContent) {
        this.yunshuContent = yunshuContent;
    }
    /**
	 * 设置：发货地址
	 */
    public Integer getFahuoaddressId() {
        return fahuoaddressId;
    }


    /**
	 * 获取：发货地址
	 */

    public void setFahuoaddressId(Integer fahuoaddressId) {
        this.fahuoaddressId = fahuoaddressId;
    }
    /**
	 * 设置：收货地址
	 */
    public Integer getShouhuoaddressId() {
        return shouhuoaddressId;
    }


    /**
	 * 获取：收货地址
	 */

    public void setShouhuoaddressId(Integer shouhuoaddressId) {
        this.shouhuoaddressId = shouhuoaddressId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：运货路线
	 */
    public Integer getYunhuoluxianId() {
        return yunhuoluxianId;
    }


    /**
	 * 获取：运货路线
	 */

    public void setYunhuoluxianId(Integer yunhuoluxianId) {
        this.yunhuoluxianId = yunhuoluxianId;
    }
    /**
	 * 设置：订单状态
	 */
    public Integer getDingdanTypes() {
        return dingdanTypes;
    }


    /**
	 * 获取：订单状态
	 */

    public void setDingdanTypes(Integer dingdanTypes) {
        this.dingdanTypes = dingdanTypes;
    }
    /**
	 * 设置：订单添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getDingdanDelete() {
        return dingdanDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setDingdanDelete(Integer dingdanDelete) {
        this.dingdanDelete = dingdanDelete;
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
        return "Dingdan{" +
            "id=" + id +
            ", dingdanUuidNumber=" + dingdanUuidNumber +
            ", shangpinName=" + shangpinName +
            ", shangpinTypes=" + shangpinTypes +
            ", yunshuContent=" + yunshuContent +
            ", fahuoaddressId=" + fahuoaddressId +
            ", shouhuoaddressId=" + shouhuoaddressId +
            ", yonghuId=" + yonghuId +
            ", yunhuoluxianId=" + yunhuoluxianId +
            ", dingdanTypes=" + dingdanTypes +
            ", insertTime=" + insertTime +
            ", dingdanDelete=" + dingdanDelete +
            ", createTime=" + createTime +
        "}";
    }
}
