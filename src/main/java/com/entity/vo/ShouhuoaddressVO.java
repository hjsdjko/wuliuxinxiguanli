package com.entity.vo;

import com.entity.ShouhuoaddressEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 收货地址
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shouhuoaddress")
public class ShouhuoaddressVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 修改时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "update_time")
    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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

}
