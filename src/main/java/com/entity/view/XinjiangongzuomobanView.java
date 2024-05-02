package com.entity.view;

import com.entity.XinjiangongzuomobanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新建工作模板
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
@TableName("xinjiangongzuomoban")
public class XinjiangongzuomobanView  extends XinjiangongzuomobanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinjiangongzuomobanView(){
	}
 
 	public XinjiangongzuomobanView(XinjiangongzuomobanEntity xinjiangongzuomobanEntity){
 	try {
			BeanUtils.copyProperties(this, xinjiangongzuomobanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
