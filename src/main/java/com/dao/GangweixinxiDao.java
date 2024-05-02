package com.dao;

import com.entity.GangweixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GangweixinxiVO;
import com.entity.view.GangweixinxiView;


/**
 * 岗位信息
 * 
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
public interface GangweixinxiDao extends BaseMapper<GangweixinxiEntity> {
	
	List<GangweixinxiVO> selectListVO(@Param("ew") Wrapper<GangweixinxiEntity> wrapper);
	
	GangweixinxiVO selectVO(@Param("ew") Wrapper<GangweixinxiEntity> wrapper);
	
	List<GangweixinxiView> selectListView(@Param("ew") Wrapper<GangweixinxiEntity> wrapper);

	List<GangweixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GangweixinxiEntity> wrapper);
	
	GangweixinxiView selectView(@Param("ew") Wrapper<GangweixinxiEntity> wrapper);
	
}
