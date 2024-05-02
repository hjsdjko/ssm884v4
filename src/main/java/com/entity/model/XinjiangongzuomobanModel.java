package com.entity.model;

import com.entity.XinjiangongzuomobanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 新建工作模板
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
public class XinjiangongzuomobanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 流程类型
	 */
	
	private String liuchengleixing;
		
	/**
	 * 表格附件
	 */
	
	private String biaogefujian;
		
	/**
	 * 流程说明
	 */
	
	private String liuchengshuoming;
				
	
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
	 * 设置：表格附件
	 */
	 
	public void setBiaogefujian(String biaogefujian) {
		this.biaogefujian = biaogefujian;
	}
	
	/**
	 * 获取：表格附件
	 */
	public String getBiaogefujian() {
		return biaogefujian;
	}
				
	
	/**
	 * 设置：流程说明
	 */
	 
	public void setLiuchengshuoming(String liuchengshuoming) {
		this.liuchengshuoming = liuchengshuoming;
	}
	
	/**
	 * 获取：流程说明
	 */
	public String getLiuchengshuoming() {
		return liuchengshuoming;
	}
			
}
