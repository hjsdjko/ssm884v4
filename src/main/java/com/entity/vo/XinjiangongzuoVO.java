package com.entity.vo;

import com.entity.XinjiangongzuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 新建工作
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
public class XinjiangongzuoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 流程类型
	 */
	
	private String liuchengleixing;
		
	/**
	 * 提交表格附件
	 */
	
	private String tijiaobiaogefujian;
		
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 提交时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tijiaoshijian;
				
	
	/**
	 * 设置：流程类型
	 */
	 
	public void setLiuchengleixing(String liuchengleixing) {
		this.liuchengleixing = liuchengleixing;
	}
	
	/**
	 * 获取：流程类型
	 */
	public String getLiuchengleixing() {
		return liuchengleixing;
	}
				
	
	/**
	 * 设置：提交表格附件
	 */
	 
	public void setTijiaobiaogefujian(String tijiaobiaogefujian) {
		this.tijiaobiaogefujian = tijiaobiaogefujian;
	}
	
	/**
	 * 获取：提交表格附件
	 */
	public String getTijiaobiaogefujian() {
		return tijiaobiaogefujian;
	}
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：提交时间
	 */
	 
	public void setTijiaoshijian(Date tijiaoshijian) {
		this.tijiaoshijian = tijiaoshijian;
	}
	
	/**
	 * 获取：提交时间
	 */
	public Date getTijiaoshijian() {
		return tijiaoshijian;
	}
			
}
