package com.dao;

import com.entity.XinjiangongzuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinjiangongzuoVO;
import com.entity.view.XinjiangongzuoView;


/**
 * 新建工作
 * 
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
public interface XinjiangongzuoDao extends BaseMapper<XinjiangongzuoEntity> {
	
	List<XinjiangongzuoVO> selectListVO(@Param("ew") Wrapper<XinjiangongzuoEntity> wrapper);
	
	XinjiangongzuoVO selectVO(@Param("ew") Wrapper<XinjiangongzuoEntity> wrapper);
	
	List<XinjiangongzuoView> selectListView(@Param("ew") Wrapper<XinjiangongzuoEntity> wrapper);

	List<XinjiangongzuoView> selectListView(Pagination page,@Param("ew") Wrapper<XinjiangongzuoEntity> wrapper);
	
	XinjiangongzuoView selectView(@Param("ew") Wrapper<XinjiangongzuoEntity> wrapper);
	
}
