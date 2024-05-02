package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaibangongzuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaibangongzuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaibangongzuoView;


/**
 * 待办工作
 *
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
public interface DaibangongzuoService extends IService<DaibangongzuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaibangongzuoVO> selectListVO(Wrapper<DaibangongzuoEntity> wrapper);
   	
   	DaibangongzuoVO selectVO(@Param("ew") Wrapper<DaibangongzuoEntity> wrapper);
   	
   	List<DaibangongzuoView> selectListView(Wrapper<DaibangongzuoEntity> wrapper);
   	
   	DaibangongzuoView selectView(@Param("ew") Wrapper<DaibangongzuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaibangongzuoEntity> wrapper);
   	
}

