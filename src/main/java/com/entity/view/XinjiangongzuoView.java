package com.entity.view;

import com.entity.XinjiangongzuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新建工作
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
@TableName("xinjiangongzuo")
public class XinjiangongzuoView  extends XinjiangongzuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinjiangongzuoView(){
	}
 
 	public XinjiangongzuoView(XinjiangongzuoEntity xinjiangongzuoEntity){
 	try {
			BeanUtils.copyProperties(this, xinjiangongzuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
