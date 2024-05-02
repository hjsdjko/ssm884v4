package com.dao;

import com.entity.LiuchengleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiuchengleixingVO;
import com.entity.view.LiuchengleixingView;


/**
 * 流程类型
 * 
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
public interface LiuchengleixingDao extends BaseMapper<LiuchengleixingEntity> {
	
	List<LiuchengleixingVO> selectListVO(@Param("ew") Wrapper<LiuchengleixingEntity> wrapper);
	
	LiuchengleixingVO selectVO(@Param("ew") Wrapper<LiuchengleixingEntity> wrapper);
	
	List<LiuchengleixingView> selectListView(@Param("ew") Wrapper<LiuchengleixingEntity> wrapper);

	List<LiuchengleixingView> selectListView(Pagination page,@Param("ew") Wrapper<LiuchengleixingEntity> wrapper);
	
	LiuchengleixingView selectView(@Param("ew") Wrapper<LiuchengleixingEntity> wrapper);
	
}
