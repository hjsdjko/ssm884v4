package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinjiangongzuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinjiangongzuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinjiangongzuoView;


/**
 * 新建工作
 *
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
public interface XinjiangongzuoService extends IService<XinjiangongzuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinjiangongzuoVO> selectListVO(Wrapper<XinjiangongzuoEntity> wrapper);
   	
   	XinjiangongzuoVO selectVO(@Param("ew") Wrapper<XinjiangongzuoEntity> wrapper);
   	
   	List<XinjiangongzuoView> selectListView(Wrapper<XinjiangongzuoEntity> wrapper);
   	
   	XinjiangongzuoView selectView(@Param("ew") Wrapper<XinjiangongzuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinjiangongzuoEntity> wrapper);
   	
}

