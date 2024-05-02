package com.dao;

import com.entity.XinjiangongzuomobanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinjiangongzuomobanVO;
import com.entity.view.XinjiangongzuomobanView;


/**
 * 新建工作模板
 * 
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
public interface XinjiangongzuomobanDao extends BaseMapper<XinjiangongzuomobanEntity> {
	
	List<XinjiangongzuomobanVO> selectListVO(@Param("ew") Wrapper<XinjiangongzuomobanEntity> wrapper);
	
	XinjiangongzuomobanVO selectVO(@Param("ew") Wrapper<XinjiangongzuomobanEntity> wrapper);
	
	List<XinjiangongzuomobanView> selectListView(@Param("ew") Wrapper<XinjiangongzuomobanEntity> wrapper);

	List<XinjiangongzuomobanView> selectListView(Pagination page,@Param("ew") Wrapper<XinjiangongzuomobanEntity> wrapper);
	
	XinjiangongzuomobanView selectView(@Param("ew") Wrapper<XinjiangongzuomobanEntity> wrapper);
	
}
