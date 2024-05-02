package com.entity.view;

import com.entity.RenshidanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 人事档案
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
@TableName("renshidangan")
public class RenshidanganView  extends RenshidanganEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenshidanganView(){
	}
 
 	public RenshidanganView(RenshidanganEntity renshidanganEntity){
 	try {
			BeanUtils.copyProperties(this, renshidanganEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}