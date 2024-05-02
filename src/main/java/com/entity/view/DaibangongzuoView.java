package com.entity.view;

import com.entity.DaibangongzuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 待办工作
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
@TableName("daibangongzuo")
public class DaibangongzuoView  extends DaibangongzuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaibangongzuoView(){
	}
 
 	public DaibangongzuoView(DaibangongzuoEntity daibangongzuoEntity){
 	try {
			BeanUtils.copyProperties(this, daibangongzuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
