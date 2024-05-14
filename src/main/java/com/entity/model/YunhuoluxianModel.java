package com.entity.model;

import com.entity.YunhuoluxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 运货路线
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YunhuoluxianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 运货路线编号
     */
    private String yunhuoluxianUuidNumber;


    /**
     * 何处出发
     */
    private String yunhuoluxianChufa;


    /**
     * 去往何处
     */
    private String yunhuoluxianHechu;


    /**
     * 大概时长
     */
    private String yunhuoluxianShichang;


    /**
     * 费用(元)/公斤
     */
    private Double yunhuoluxianFeiyong;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：运货路线编号
	 */
    public String getYunhuoluxianUuidNumber() {
        return yunhuoluxianUuidNumber;
    }


    /**
	 * 设置：运货路线编号
	 */
    public void setYunhuoluxianUuidNumber(String yunhuoluxianUuidNumber) {
        this.yunhuoluxianUuidNumber = yunhuoluxianUuidNumber;
    }
    /**
	 * 获取：何处出发
	 */
    public String getYunhuoluxianChufa() {
        return yunhuoluxianChufa;
    }


    /**
	 * 设置：何处出发
	 */
    public void setYunhuoluxianChufa(String yunhuoluxianChufa) {
        this.yunhuoluxianChufa = yunhuoluxianChufa;
    }
    /**
	 * 获取：去往何处
	 */
    public String getYunhuoluxianHechu() {
        return yunhuoluxianHechu;
    }


    /**
	 * 设置：去往何处
	 */
    public void setYunhuoluxianHechu(String yunhuoluxianHechu) {
        this.yunhuoluxianHechu = yunhuoluxianHechu;
    }
    /**
	 * 获取：大概时长
	 */
    public String getYunhuoluxianShichang() {
        return yunhuoluxianShichang;
    }


    /**
	 * 设置：大概时长
	 */
    public void setYunhuoluxianShichang(String yunhuoluxianShichang) {
        this.yunhuoluxianShichang = yunhuoluxianShichang;
    }
    /**
	 * 获取：费用(元)/公斤
	 */
    public Double getYunhuoluxianFeiyong() {
        return yunhuoluxianFeiyong;
    }


    /**
	 * 设置：费用(元)/公斤
	 */
    public void setYunhuoluxianFeiyong(Double yunhuoluxianFeiyong) {
        this.yunhuoluxianFeiyong = yunhuoluxianFeiyong;
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
