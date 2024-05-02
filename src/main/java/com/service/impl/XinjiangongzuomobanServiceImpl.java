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


import com.dao.XinjiangongzuomobanDao;
import com.entity.XinjiangongzuomobanEntity;
import com.service.XinjiangongzuomobanService;
import com.entity.vo.XinjiangongzuomobanVO;
import com.entity.view.XinjiangongzuomobanView;

@Service("xinjiangongzuomobanService")
public class XinjiangongzuomobanServiceImpl extends ServiceImpl<XinjiangongzuomobanDao, XinjiangongzuomobanEntity> implements XinjiangongzuomobanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinjiangongzuomobanEntity> page = this.selectPage(
                new Query<XinjiangongzuomobanEntity>(params).getPage(),
                new EntityWrapper<XinjiangongzuomobanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinjiangongzuomobanEntity> wrapper) {
		  Page<XinjiangongzuomobanView> page =new Query<XinjiangongzuomobanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinjiangongzuomobanVO> selectListVO(Wrapper<XinjiangongzuomobanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinjiangongzuomobanVO selectVO(Wrapper<XinjiangongzuomobanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinjiangongzuomobanView> selectListView(Wrapper<XinjiangongzuomobanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinjiangongzuomobanView selectView(Wrapper<XinjiangongzuomobanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
