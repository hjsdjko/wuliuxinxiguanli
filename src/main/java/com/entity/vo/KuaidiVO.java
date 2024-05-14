package com.entity.vo;

import com.entity.KuaidiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 快递单号
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kuaidi")
public class KuaidiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 订单
     */

    @TableField(value = "dingdan_id")
    private Integer dingdanId;


    /**
     * 快递公司
     */

    @TableField(value = "kuaidi_name")
    private String kuaidiName;


    /**
     * 单号
     */

    @TableField(value = "kuaidi_danhao")
    private String kuaidiDanhao;


    /**
     * 快递状态
     */

    @TableField(value = "kuaidi_types")
    private Integer kuaidiTypes;


    /**
     * 快递详情
     */

    @TableField(value = "kuaidi_text")
    private String kuaidiText;


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
	 * 设置：订单
	 */
    public Integer getDingdanId() {
        return dingdanId;
    }


    /**
	 * 获取：订单
	 */

    public void setDingdanId(Integer dingdanId) {
        this.dingdanId = dingdanId;
    }
    /**
	 * 设置：快递公司
	 */
    public String getKuaidiName() {
        return kuaidiName;
    }


    /**
	 * 获取：快递公司
	 */

    public void setKuaidiName(String kuaidiName) {
        this.kuaidiName = kuaidiName;
    }
    /**
	 * 设置：单号
	 */
    public String getKuaidiDanhao() {
        return kuaidiDanhao;
    }


    /**
	 * 获取：单号
	 */

    public void setKuaidiDanhao(String kuaidiDanhao) {
        this.kuaidiDanhao = kuaidiDanhao;
    }
    /**
	 * 设置：快递状态
	 */
    public Integer getKuaidiTypes() {
        return kuaidiTypes;
    }


    /**
	 * 获取：快递状态
	 */

    public void setKuaidiTypes(Integer kuaidiTypes) {
        this.kuaidiTypes = kuaidiTypes;
    }
    /**
	 * 设置：快递详情
	 */
    public String getKuaidiText() {
        return kuaidiText;
    }


    /**
	 * 获取：快递详情
	 */

    public void setKuaidiText(String kuaidiText) {
        this.kuaidiText = kuaidiText;
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
