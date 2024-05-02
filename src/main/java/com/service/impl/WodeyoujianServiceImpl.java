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


import com.dao.WodeyoujianDao;
import com.entity.WodeyoujianEntity;
import com.service.WodeyoujianService;
import com.entity.vo.WodeyoujianVO;
import com.entity.view.WodeyoujianView;

@Service("wodeyoujianService")
public class WodeyoujianServiceImpl extends ServiceImpl<WodeyoujianDao, WodeyoujianEntity> implements WodeyoujianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WodeyoujianEntity> page = this.selectPage(
                new Query<WodeyoujianEntity>(params).getPage(),
                new EntityWrapper<WodeyoujianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WodeyoujianEntity> wrapper) {
		  Page<WodeyoujianView> page =new Query<WodeyoujianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WodeyoujianVO> selectListVO(Wrapper<WodeyoujianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WodeyoujianVO selectVO(Wrapper<WodeyoujianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WodeyoujianView> selectListView(Wrapper<WodeyoujianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WodeyoujianView selectView(Wrapper<WodeyoujianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
