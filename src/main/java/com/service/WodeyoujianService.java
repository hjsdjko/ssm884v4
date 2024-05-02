package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WodeyoujianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WodeyoujianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WodeyoujianView;


/**
 * 我的邮件
 *
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
public interface WodeyoujianService extends IService<WodeyoujianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WodeyoujianVO> selectListVO(Wrapper<WodeyoujianEntity> wrapper);
   	
   	WodeyoujianVO selectVO(@Param("ew") Wrapper<WodeyoujianEntity> wrapper);
   	
   	List<WodeyoujianView> selectListView(Wrapper<WodeyoujianEntity> wrapper);
   	
   	WodeyoujianView selectView(@Param("ew") Wrapper<WodeyoujianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WodeyoujianEntity> wrapper);
   	
}

