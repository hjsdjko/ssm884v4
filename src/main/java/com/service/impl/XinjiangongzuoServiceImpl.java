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


import com.dao.XinjiangongzuoDao;
import com.entity.XinjiangongzuoEntity;
import com.service.XinjiangongzuoService;
import com.entity.vo.XinjiangongzuoVO;
import com.entity.view.XinjiangongzuoView;

@Service("xinjiangongzuoService")
public class XinjiangongzuoServiceImpl extends ServiceImpl<XinjiangongzuoDao, XinjiangongzuoEntity> implements XinjiangongzuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinjiangongzuoEntity> page = this.selectPage(
                new Query<XinjiangongzuoEntity>(params).getPage(),
                new EntityWrapper<XinjiangongzuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinjiangongzuoEntity> wrapper) {
		  Page<XinjiangongzuoView> page =new Query<XinjiangongzuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinjiangongzuoVO> selectListVO(Wrapper<XinjiangongzuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinjiangongzuoVO selectVO(Wrapper<XinjiangongzuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinjiangongzuoView> selectListView(Wrapper<XinjiangongzuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinjiangongzuoView selectView(Wrapper<XinjiangongzuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
