package com.entity.view;

import com.entity.KuaidiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 快递单号
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kuaidi")
public class KuaidiView extends KuaidiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 快递状态的值
		*/
		private String kuaidiValue;



		//级联表 dingdan
			/**
			* 订单号
			*/
			private String dingdanUuidNumber;
			/**
			* 运输物品名称
			*/
			private String shangpinName;
			/**
			* 运输物品类型
			*/
			private Integer shangpinTypes;
				/**
				* 运输物品类型的值
				*/
				private String shangpinValue;
			/**
			* 运输物品详情
			*/
			private String yunshuContent;
			/**
			* 订单 的 用户
			*/
			private Integer dingdanYonghuId;
			/**
			* 订单状态
			*/
			private Integer dingdanTypes;
				/**
				* 订单状态的值
				*/
				private String dingdanValue;
			/**
			* 逻辑删除
			*/
			private Integer dingdanDelete;

	public KuaidiView() {

	}

	public KuaidiView(KuaidiEntity kuaidiEntity) {
		try {
			BeanUtils.copyProperties(this, kuaidiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 快递状态的值
			*/
			public String getKuaidiValue() {
				return kuaidiValue;
			}
			/**
			* 设置： 快递状态的值
			*/
			public void setKuaidiValue(String kuaidiValue) {
				this.kuaidiValue = kuaidiValue;
			}






				//级联表的get和set dingdan
					/**
					* 获取： 订单号
					*/
					public String getDingdanUuidNumber() {
						return dingdanUuidNumber;
					}
					/**
					* 设置： 订单号
					*/
					public void setDingdanUuidNumber(String dingdanUuidNumber) {
						this.dingdanUuidNumber = dingdanUuidNumber;
					}
					/**
					* 获取： 运输物品名称
					*/
					public String getShangpinName() {
						return shangpinName;
					}
					/**
					* 设置： 运输物品名称
					*/
					public void setShangpinName(String shangpinName) {
						this.shangpinName = shangpinName;
					}
					/**
					* 获取： 运输物品类型
					*/
					public Integer getShangpinTypes() {
						return shangpinTypes;
					}
					/**
					* 设置： 运输物品类型
					*/
					public void setShangpinTypes(Integer shangpinTypes) {
						this.shangpinTypes = shangpinTypes;
					}


						/**
						* 获取： 运输物品类型的值
						*/
						public String getShangpinValue() {
							return shangpinValue;
						}
						/**
						* 设置： 运输物品类型的值
						*/
						public void setShangpinValue(String shangpinValue) {
							this.shangpinValue = shangpinValue;
						}
					/**
					* 获取： 运输物品详情
					*/
					public String getYunshuContent() {
						return yunshuContent;
					}
					/**
					* 设置： 运输物品详情
					*/
					public void setYunshuContent(String yunshuContent) {
						this.yunshuContent = yunshuContent;
					}


					/**
					* 获取：订单 的 用户
					*/
					public Integer getDingdanYonghuId() {
						return dingdanYonghuId;
					}
					/**
					* 设置：订单 的 用户
					*/
					public void setDingdanYonghuId(Integer dingdanYonghuId) {
						this.dingdanYonghuId = dingdanYonghuId;
					}


					/**
					* 获取： 订单状态
					*/
					public Integer getDingdanTypes() {
						return dingdanTypes;
					}
					/**
					* 设置： 订单状态
					*/
					public void setDingdanTypes(Integer dingdanTypes) {
						this.dingdanTypes = dingdanTypes;
					}


						/**
						* 获取： 订单状态的值
						*/
						public String getDingdanValue() {
							return dingdanValue;
						}
						/**
						* 设置： 订单状态的值
						*/
						public void setDingdanValue(String dingdanValue) {
							this.dingdanValue = dingdanValue;
						}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getDingdanDelete() {
						return dingdanDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setDingdanDelete(Integer dingdanDelete) {
						this.dingdanDelete = dingdanDelete;
					}














}
