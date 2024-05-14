package com.entity.model;

import com.entity.KuaidiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 快递单号
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KuaidiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单
     */
    private Integer dingdanId;


    /**
     * 快递公司
     */
    private String kuaidiName;


    /**
     * 单号
     */
    private String kuaidiDanhao;


    /**
     * 快递状态
     */
    private Integer kuaidiTypes;


    /**
     * 快递详情
     */
    private String kuaidiText;


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
	 * 获取：订单
	 */
    public Integer getDingdanId() {
        return dingdanId;
    }


    /**
	 * 设置：订单
	 */
    public void setDingdanId(Integer dingdanId) {
        this.dingdanId = dingdanId;
    }
    /**
	 * 获取：快递公司
	 */
    public String getKuaidiName() {
        return kuaidiName;
    }


    /**
	 * 设置：快递公司
	 */
    public void setKuaidiName(String kuaidiName) {
        this.kuaidiName = kuaidiName;
    }
    /**
	 * 获取：单号
	 */
    public String getKuaidiDanhao() {
        return kuaidiDanhao;
    }


    /**
	 * 设置：单号
	 */
    public void setKuaidiDanhao(String kuaidiDanhao) {
        this.kuaidiDanhao = kuaidiDanhao;
    }
    /**
	 * 获取：快递状态
	 */
    public Integer getKuaidiTypes() {
        return kuaidiTypes;
    }


    /**
	 * 设置：快递状态
	 */
    public void setKuaidiTypes(Integer kuaidiTypes) {
        this.kuaidiTypes = kuaidiTypes;
    }
    /**
	 * 获取：快递详情
	 */
    public String getKuaidiText() {
        return kuaidiText;
    }


    /**
	 * 设置：快递详情
	 */
    public void setKuaidiText(String kuaidiText) {
        this.kuaidiText = kuaidiText;
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
