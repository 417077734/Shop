package com.snack.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.snack.model.domain.DoRecord;
import com.snack.model.domain.DoSell;
import com.snack.service.adminPieMapService;
import com.snack.service.adminSnackInfoService;



@Controller
@RequestMapping("/admin/map/")
public class adminMapController {
	
	@Autowired
	private adminPieMapService adminPieMapService;
	@Autowired
	private adminSnackInfoService adminSnackInfoService;
	//goto图形页面
	@RequestMapping("mainToPieMap")
	public String gotoUserLogin(){
		return "admin/table/pieMap";
	}
	
	//饼图
	@RequestMapping("adminPieMapList")
	@ResponseBody
	public List<DoRecord> adminPieMapList(String startDate,String endDate){
		return adminPieMapService.selectGroupBytype(startDate, endDate);
	}
	
	

}
