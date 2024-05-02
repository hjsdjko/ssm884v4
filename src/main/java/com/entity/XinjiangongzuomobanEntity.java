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
 * 新建工作模板
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
@TableName("xinjiangongzuomoban")
public class XinjiangongzuomobanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XinjiangongzuomobanEntity() {
		
	}
	
	public XinjiangongzuomobanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 流程代码
	 */
					
	private String liuchengdaima;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：流程代码
	 */
	public void setLiuchengdaima(String liuchengdaima) {
		this.liuchengdaima = liuchengdaima;
	}
	/**
	 * 获取：流程代码
	 */
	public String getLiuchengdaima() {
		return liuchengdaima;
	}
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
