package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WodeyoujianEntity;
import com.entity.view.WodeyoujianView;

import com.service.WodeyoujianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 我的邮件
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
@RestController
@RequestMapping("/wodeyoujian")
public class WodeyoujianController {
    @Autowired
    private WodeyoujianService wodeyoujianService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WodeyoujianEntity wodeyoujian, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			wodeyoujian.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WodeyoujianEntity> ew = new EntityWrapper<WodeyoujianEntity>();
		PageUtils page = wodeyoujianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wodeyoujian), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WodeyoujianEntity wodeyoujian, HttpServletRequest request){
        EntityWrapper<WodeyoujianEntity> ew = new EntityWrapper<WodeyoujianEntity>();
		PageUtils page = wodeyoujianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wodeyoujian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WodeyoujianEntity wodeyoujian){
       	EntityWrapper<WodeyoujianEntity> ew = new EntityWrapper<WodeyoujianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wodeyoujian, "wodeyoujian")); 
        return R.ok().put("data", wodeyoujianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WodeyoujianEntity wodeyoujian){
        EntityWrapper< WodeyoujianEntity> ew = new EntityWrapper< WodeyoujianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wodeyoujian, "wodeyoujian")); 
		WodeyoujianView wodeyoujianView =  wodeyoujianService.selectView(ew);
		return R.ok("查询我的邮件成功").put("data", wodeyoujianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WodeyoujianEntity wodeyoujian = wodeyoujianService.selectById(id);
        return R.ok().put("data", wodeyoujian);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WodeyoujianEntity wodeyoujian = wodeyoujianService.selectById(id);
        return R.ok().put("data", wodeyoujian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WodeyoujianEntity wodeyoujian, HttpServletRequest request){
    	wodeyoujian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wodeyoujian);

        wodeyoujianService.insert(wodeyoujian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WodeyoujianEntity wodeyoujian, HttpServletRequest request){
    	wodeyoujian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wodeyoujian);

        wodeyoujianService.insert(wodeyoujian);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WodeyoujianEntity wodeyoujian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wodeyoujian);
        wodeyoujianService.updateById(wodeyoujian);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wodeyoujianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WodeyoujianEntity> wrapper = new EntityWrapper<WodeyoujianEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			wrapper.eq("yuangonggonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = wodeyoujianService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
