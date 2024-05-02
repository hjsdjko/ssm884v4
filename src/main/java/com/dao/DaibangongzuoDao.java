package com.dao;

import com.entity.DaibangongzuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaibangongzuoVO;
import com.entity.view.DaibangongzuoView;


/**
 * 待办工作
 * 
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
public interface DaibangongzuoDao extends BaseMapper<DaibangongzuoEntity> {
	
	List<DaibangongzuoVO> selectListVO(@Param("ew") Wrapper<DaibangongzuoEntity> wrapper);
	
	DaibangongzuoVO selectVO(@Param("ew") Wrapper<DaibangongzuoEntity> wrapper);
	
	List<DaibangongzuoView> selectListView(@Param("ew") Wrapper<DaibangongzuoEntity> wrapper);

	List<DaibangongzuoView> selectListView(Pagination page,@Param("ew") Wrapper<DaibangongzuoEntity> wrapper);
	
	DaibangongzuoView selectView(@Param("ew") Wrapper<DaibangongzuoEntity> wrapper);
	
}
