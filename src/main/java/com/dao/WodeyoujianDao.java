package com.dao;

import com.entity.WodeyoujianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WodeyoujianVO;
import com.entity.view.WodeyoujianView;


/**
 * 我的邮件
 * 
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
public interface WodeyoujianDao extends BaseMapper<WodeyoujianEntity> {
	
	List<WodeyoujianVO> selectListVO(@Param("ew") Wrapper<WodeyoujianEntity> wrapper);
	
	WodeyoujianVO selectVO(@Param("ew") Wrapper<WodeyoujianEntity> wrapper);
	
	List<WodeyoujianView> selectListView(@Param("ew") Wrapper<WodeyoujianEntity> wrapper);

	List<WodeyoujianView> selectListView(Pagination page,@Param("ew") Wrapper<WodeyoujianEntity> wrapper);
	
	WodeyoujianView selectView(@Param("ew") Wrapper<WodeyoujianEntity> wrapper);
	
}
