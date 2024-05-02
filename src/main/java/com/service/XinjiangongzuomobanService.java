package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinjiangongzuomobanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinjiangongzuomobanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinjiangongzuomobanView;


/**
 * 新建工作模板
 *
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
public interface XinjiangongzuomobanService extends IService<XinjiangongzuomobanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinjiangongzuomobanVO> selectListVO(Wrapper<XinjiangongzuomobanEntity> wrapper);
   	
   	XinjiangongzuomobanVO selectVO(@Param("ew") Wrapper<XinjiangongzuomobanEntity> wrapper);
   	
   	List<XinjiangongzuomobanView> selectListView(Wrapper<XinjiangongzuomobanEntity> wrapper);
   	
   	XinjiangongzuomobanView selectView(@Param("ew") Wrapper<XinjiangongzuomobanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinjiangongzuomobanEntity> wrapper);
   	
}

