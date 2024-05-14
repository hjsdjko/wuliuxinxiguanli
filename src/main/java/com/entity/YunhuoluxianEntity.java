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
 * 运货路线
 *
 * @author 
 * @email
 */
@TableName("yunhuoluxian")
public class YunhuoluxianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YunhuoluxianEntity() {

	}

	public YunhuoluxianEntity(T t) {
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
     * 运货路线编号
     */
    @TableField(value = "yunhuoluxian_uuid_number")

    private String yunhuoluxianUuidNumber;


    /**
     * 何处出发
     */
    @TableField(value = "yunhuoluxian_chufa")

    private String yunhuoluxianChufa;


    /**
     * 去往何处
     */
    @TableField(value = "yunhuoluxian_hechu")

    private String yunhuoluxianHechu;


    /**
     * 大概时长
     */
    @TableField(value = "yunhuoluxian_shichang")

    private String yunhuoluxianShichang;


    /**
     * 费用(元)/公斤
     */
    @TableField(value = "yunhuoluxian_feiyong")

    private Double yunhuoluxianFeiyong;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：运货路线编号
	 */
    public String getYunhuoluxianUuidNumber() {
        return yunhuoluxianUuidNumber;
    }


    /**
	 * 获取：运货路线编号
	 */

    public void setYunhuoluxianUuidNumber(String yunhuoluxianUuidNumber) {
        this.yunhuoluxianUuidNumber = yunhuoluxianUuidNumber;
    }
    /**
	 * 设置：何处出发
	 */
    public String getYunhuoluxianChufa() {
        return yunhuoluxianChufa;
    }


    /**
	 * 获取：何处出发
	 */

    public void setYunhuoluxianChufa(String yunhuoluxianChufa) {
        this.yunhuoluxianChufa = yunhuoluxianChufa;
    }
    /**
	 * 设置：去往何处
	 */
    public String getYunhuoluxianHechu() {
        return yunhuoluxianHechu;
    }


    /**
	 * 获取：去往何处
	 */

    public void setYunhuoluxianHechu(String yunhuoluxianHechu) {
        this.yunhuoluxianHechu = yunhuoluxianHechu;
    }
    /**
	 * 设置：大概时长
	 */
    public String getYunhuoluxianShichang() {
        return yunhuoluxianShichang;
    }


    /**
	 * 获取：大概时长
	 */

    public void setYunhuoluxianShichang(String yunhuoluxianShichang) {
        this.yunhuoluxianShichang = yunhuoluxianShichang;
    }
    /**
	 * 设置：费用(元)/公斤
	 */
    public Double getYunhuoluxianFeiyong() {
        return yunhuoluxianFeiyong;
    }


    /**
	 * 获取：费用(元)/公斤
	 */

    public void setYunhuoluxianFeiyong(Double yunhuoluxianFeiyong) {
        this.yunhuoluxianFeiyong = yunhuoluxianFeiyong;
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
        return "Yunhuoluxian{" +
            "id=" + id +
            ", yunhuoluxianUuidNumber=" + yunhuoluxianUuidNumber +
            ", yunhuoluxianChufa=" + yunhuoluxianChufa +
            ", yunhuoluxianHechu=" + yunhuoluxianHechu +
            ", yunhuoluxianShichang=" + yunhuoluxianShichang +
            ", yunhuoluxianFeiyong=" + yunhuoluxianFeiyong +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
