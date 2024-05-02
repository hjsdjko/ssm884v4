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

import com.entity.XinjiangongzuomobanEntity;
import com.entity.view.XinjiangongzuomobanView;

import com.service.XinjiangongzuomobanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 新建工作模板
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-16 19:04:01
 */
@RestController
@RequestMapping("/xinjiangongzuomoban")
public class XinjiangongzuomobanController {
    @Autowired
    private XinjiangongzuomobanService xinjiangongzuomobanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XinjiangongzuomobanEntity xinjiangongzuomoban, 
		HttpServletRequest request){

        EntityWrapper<XinjiangongzuomobanEntity> ew = new EntityWrapper<XinjiangongzuomobanEntity>();
		PageUtils page = xinjiangongzuomobanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinjiangongzuomoban), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XinjiangongzuomobanEntity xinjiangongzuomoban, HttpServletRequest request){
        EntityWrapper<XinjiangongzuomobanEntity> ew = new EntityWrapper<XinjiangongzuomobanEntity>();
		PageUtils page = xinjiangongzuomobanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinjiangongzuomoban), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XinjiangongzuomobanEntity xinjiangongzuomoban){
       	EntityWrapper<XinjiangongzuomobanEntity> ew = new EntityWrapper<XinjiangongzuomobanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xinjiangongzuomoban, "xinjiangongzuomoban")); 
        return R.ok().put("data", xinjiangongzuomobanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XinjiangongzuomobanEntity xinjiangongzuomoban){
        EntityWrapper< XinjiangongzuomobanEntity> ew = new EntityWrapper< XinjiangongzuomobanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xinjiangongzuomoban, "xinjiangongzuomoban")); 
		XinjiangongzuomobanView xinjiangongzuomobanView =  xinjiangongzuomobanService.selectView(ew);
		return R.ok("查询新建工作模板成功").put("data", xinjiangongzuomobanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XinjiangongzuomobanEntity xinjiangongzuomoban = xinjiangongzuomobanService.selectById(id);
        return R.ok().put("data", xinjiangongzuomoban);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XinjiangongzuomobanEntity xinjiangongzuomoban = xinjiangongzuomobanService.selectById(id);
        return R.ok().put("data", xinjiangongzuomoban);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XinjiangongzuomobanEntity xinjiangongzuomoban, HttpServletRequest request){
    	xinjiangongzuomoban.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinjiangongzuomoban);

        xinjiangongzuomobanService.insert(xinjiangongzuomoban);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XinjiangongzuomobanEntity xinjiangongzuomoban, HttpServletRequest request){
    	xinjiangongzuomoban.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinjiangongzuomoban);

        xinjiangongzuomobanService.insert(xinjiangongzuomoban);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XinjiangongzuomobanEntity xinjiangongzuomoban, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xinjiangongzuomoban);
        xinjiangongzuomobanService.updateById(xinjiangongzuomoban);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xinjiangongzuomobanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<XinjiangongzuomobanEntity> wrapper = new EntityWrapper<XinjiangongzuomobanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = xinjiangongzuomobanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
