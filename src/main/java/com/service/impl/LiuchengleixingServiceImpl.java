package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LiuchengleixingDao;
import com.entity.LiuchengleixingEntity;
import com.service.LiuchengleixingService;
import com.entity.vo.LiuchengleixingVO;
import com.entity.view.LiuchengleixingView;

@Service("liuchengleixingService")
public class LiuchengleixingServiceImpl extends ServiceImpl<LiuchengleixingDao, LiuchengleixingEntity> implements LiuchengleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiuchengleixingEntity> page = this.selectPage(
                new Query<LiuchengleixingEntity>(params).getPage(),
                new EntityWrapper<LiuchengleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiuchengleixingEntity> wrapper) {
		  Page<LiuchengleixingView> page =new Query<LiuchengleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiuchengleixingVO> selectListVO(Wrapper<LiuchengleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiuchengleixingVO selectVO(Wrapper<LiuchengleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiuchengleixingView> selectListView(Wrapper<LiuchengleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiuchengleixingView selectView(Wrapper<LiuchengleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
