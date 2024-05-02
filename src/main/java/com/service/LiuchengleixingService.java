package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiuchengleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiuchengleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiuchengleixingView;


/**
 * 流程类型
 *
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
public interface LiuchengleixingService extends IService<LiuchengleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiuchengleixingVO> selectListVO(Wrapper<LiuchengleixingEntity> wrapper);
   	
   	LiuchengleixingVO selectVO(@Param("ew") Wrapper<LiuchengleixingEntity> wrapper);
   	
   	List<LiuchengleixingView> selectListView(Wrapper<LiuchengleixingEntity> wrapper);
   	
   	LiuchengleixingView selectView(@Param("ew") Wrapper<LiuchengleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiuchengleixingEntity> wrapper);
   	
}

