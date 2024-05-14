package com.entity.vo;

import com.entity.FahuoaddressEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 发货地址
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("fahuoaddress")
public class FahuoaddressVO implements Serializable {
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
     * 发货人
     */

    @TableField(value = "fahuoaddress_name")
    private String fahuoaddressName;


    /**
     * 发货电话
     */

    @TableField(value = "fahuoaddress_phone")
    private String fahuoaddressPhone;


    /**
     * 发货地址
     */

    @TableField(value = "fahuoaddress_dizhi")
    private String fahuoaddressDizhi;


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
	 * 设置：发货人
	 */
    public String getFahuoaddressName() {
        return fahuoaddressName;
    }


    /**
	 * 获取：发货人
	 */

    public void setFahuoaddressName(String fahuoaddressName) {
        this.fahuoaddressName = fahuoaddressName;
    }
    /**
	 * 设置：发货电话
	 */
    public String getFahuoaddressPhone() {
        return fahuoaddressPhone;
    }


    /**
	 * 获取：发货电话
	 */

    public void setFahuoaddressPhone(String fahuoaddressPhone) {
        this.fahuoaddressPhone = fahuoaddressPhone;
    }
    /**
	 * 设置：发货地址
	 */
    public String getFahuoaddressDizhi() {
        return fahuoaddressDizhi;
    }


    /**
	 * 获取：发货地址
	 */

    public void setFahuoaddressDizhi(String fahuoaddressDizhi) {
        this.fahuoaddressDizhi = fahuoaddressDizhi;
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
