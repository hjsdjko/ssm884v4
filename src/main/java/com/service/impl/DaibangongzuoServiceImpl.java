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


import com.dao.DaibangongzuoDao;
import com.entity.DaibangongzuoEntity;
import com.service.DaibangongzuoService;
import com.entity.vo.DaibangongzuoVO;
import com.entity.view.DaibangongzuoView;

@Service("daibangongzuoService")
public class DaibangongzuoServiceImpl extends ServiceImpl<DaibangongzuoDao, DaibangongzuoEntity> implements DaibangongzuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaibangongzuoEntity> page = this.selectPage(
                new Query<DaibangongzuoEntity>(params).getPage(),
                new EntityWrapper<DaibangongzuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaibangongzuoEntity> wrapper) {
		  Page<DaibangongzuoView> page =new Query<DaibangongzuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaibangongzuoVO> selectListVO(Wrapper<DaibangongzuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaibangongzuoVO selectVO(Wrapper<DaibangongzuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaibangongzuoView> selectListView(Wrapper<DaibangongzuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaibangongzuoView selectView(Wrapper<DaibangongzuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
