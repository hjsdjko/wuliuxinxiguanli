package com.entity.vo;

import com.entity.YunhuoluxianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 运货路线
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yunhuoluxian")
public class YunhuoluxianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


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

}
