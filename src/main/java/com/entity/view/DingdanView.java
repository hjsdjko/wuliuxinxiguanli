package com.entity.view;

import com.entity.DingdanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("dingdan")
public class DingdanView extends DingdanEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 运输物品类型的值
		*/
		private String shangpinValue;
		/**
		* 订单状态的值
		*/
		private String dingdanValue;



		//级联表 fahuoaddress
			/**
			* 发货地址 的 创建用户
			*/
			private Integer fahuoaddressYonghuId;
			/**
			* 发货人
			*/
			private String fahuoaddressName;
			/**
			* 发货电话
			*/
			private String fahuoaddressPhone;
			/**
			* 发货地址
			*/
			private String fahuoaddressDizhi;

		//级联表 shouhuoaddress
			/**
			* 收货地址 的 创建用户
			*/
			private Integer shouhuoaddressYonghuId;
			/**
			* 收货人
			*/
			private String shouhuoaddressName;
			/**
			* 收货电话
			*/
			private String shouhuoaddressPhone;
			/**
			* 收货地址
			*/
			private String shouhuoaddressDizhi;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

		//级联表 yunhuoluxian
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

	public DingdanView() {

	}

	public DingdanView(DingdanEntity dingdanEntity) {
		try {
			BeanUtils.copyProperties(this, dingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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














				//级联表的get和set fahuoaddress
					/**
					* 获取：发货地址 的 创建用户
					*/
					public Integer getFahuoaddressYonghuId() {
						return fahuoaddressYonghuId;
					}
					/**
					* 设置：发货地址 的 创建用户
					*/
					public void setFahuoaddressYonghuId(Integer fahuoaddressYonghuId) {
						this.fahuoaddressYonghuId = fahuoaddressYonghuId;
					}

					/**
					* 获取： 发货人
					*/
					public String getFahuoaddressName() {
						return fahuoaddressName;
					}
					/**
					* 设置： 发货人
					*/
					public void setFahuoaddressName(String fahuoaddressName) {
						this.fahuoaddressName = fahuoaddressName;
					}
					/**
					* 获取： 发货电话
					*/
					public String getFahuoaddressPhone() {
						return fahuoaddressPhone;
					}
					/**
					* 设置： 发货电话
					*/
					public void setFahuoaddressPhone(String fahuoaddressPhone) {
						this.fahuoaddressPhone = fahuoaddressPhone;
					}
					/**
					* 获取： 发货地址
					*/
					public String getFahuoaddressDizhi() {
						return fahuoaddressDizhi;
					}
					/**
					* 设置： 发货地址
					*/
					public void setFahuoaddressDizhi(String fahuoaddressDizhi) {
						this.fahuoaddressDizhi = fahuoaddressDizhi;
					}
















				//级联表的get和set shouhuoaddress
					/**
					* 获取：收货地址 的 创建用户
					*/
					public Integer getShouhuoaddressYonghuId() {
						return shouhuoaddressYonghuId;
					}
					/**
					* 设置：收货地址 的 创建用户
					*/
					public void setShouhuoaddressYonghuId(Integer shouhuoaddressYonghuId) {
						this.shouhuoaddressYonghuId = shouhuoaddressYonghuId;
					}

					/**
					* 获取： 收货人
					*/
					public String getShouhuoaddressName() {
						return shouhuoaddressName;
					}
					/**
					* 设置： 收货人
					*/
					public void setShouhuoaddressName(String shouhuoaddressName) {
						this.shouhuoaddressName = shouhuoaddressName;
					}
					/**
					* 获取： 收货电话
					*/
					public String getShouhuoaddressPhone() {
						return shouhuoaddressPhone;
					}
					/**
					* 设置： 收货电话
					*/
					public void setShouhuoaddressPhone(String shouhuoaddressPhone) {
						this.shouhuoaddressPhone = shouhuoaddressPhone;
					}
					/**
					* 获取： 收货地址
					*/
					public String getShouhuoaddressDizhi() {
						return shouhuoaddressDizhi;
					}
					/**
					* 设置： 收货地址
					*/
					public void setShouhuoaddressDizhi(String shouhuoaddressDizhi) {
						this.shouhuoaddressDizhi = shouhuoaddressDizhi;
					}






				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}






				//级联表的get和set yunhuoluxian
					/**
					* 获取： 运货路线编号
					*/
					public String getYunhuoluxianUuidNumber() {
						return yunhuoluxianUuidNumber;
					}
					/**
					* 设置： 运货路线编号
					*/
					public void setYunhuoluxianUuidNumber(String yunhuoluxianUuidNumber) {
						this.yunhuoluxianUuidNumber = yunhuoluxianUuidNumber;
					}
					/**
					* 获取： 何处出发
					*/
					public String getYunhuoluxianChufa() {
						return yunhuoluxianChufa;
					}
					/**
					* 设置： 何处出发
					*/
					public void setYunhuoluxianChufa(String yunhuoluxianChufa) {
						this.yunhuoluxianChufa = yunhuoluxianChufa;
					}
					/**
					* 获取： 去往何处
					*/
					public String getYunhuoluxianHechu() {
						return yunhuoluxianHechu;
					}
					/**
					* 设置： 去往何处
					*/
					public void setYunhuoluxianHechu(String yunhuoluxianHechu) {
						this.yunhuoluxianHechu = yunhuoluxianHechu;
					}
					/**
					* 获取： 大概时长
					*/
					public String getYunhuoluxianShichang() {
						return yunhuoluxianShichang;
					}
					/**
					* 设置： 大概时长
					*/
					public void setYunhuoluxianShichang(String yunhuoluxianShichang) {
						this.yunhuoluxianShichang = yunhuoluxianShichang;
					}
					/**
					* 获取： 费用(元)/公斤
					*/
					public Double getYunhuoluxianFeiyong() {
						return yunhuoluxianFeiyong;
					}
					/**
					* 设置： 费用(元)/公斤
					*/
					public void setYunhuoluxianFeiyong(Double yunhuoluxianFeiyong) {
						this.yunhuoluxianFeiyong = yunhuoluxianFeiyong;
					}





}
