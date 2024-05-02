package com.dao;

import com.entity.GonggaotongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GonggaotongzhiVO;
import com.entity.view.GonggaotongzhiView;


/**
 * 公告通知
 * 
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
public interface GonggaotongzhiDao extends BaseMapper<GonggaotongzhiEntity> {
	
	List<GonggaotongzhiVO> selectListVO(@Param("ew") Wrapper<GonggaotongzhiEntity> wrapper);
	
	GonggaotongzhiVO selectVO(@Param("ew") Wrapper<GonggaotongzhiEntity> wrapper);
	
	List<GonggaotongzhiView> selectListView(@Param("ew") Wrapper<GonggaotongzhiEntity> wrapper);

	List<GonggaotongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<GonggaotongzhiEntity> wrapper);
	
	GonggaotongzhiView selectView(@Param("ew") Wrapper<GonggaotongzhiEntity> wrapper);
	
}
