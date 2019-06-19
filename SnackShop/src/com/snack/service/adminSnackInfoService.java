package com.snack.service;

import java.util.List;
import java.util.Map;

import com.snack.model.Snackinfo;
import com.snack.model.domain.DoRecord;
import com.snack.model.domain.DoSell;
import com.snack.utils.PageHelp;

public interface adminSnackInfoService {
	PageHelp<Snackinfo> selectAdminSnackinfoLimit(Map<Object,Object> map);
	int addAdminSnackinfo(Snackinfo snackinfo);
	int delAdminSnackinfo(int sId);
	Snackinfo selectAdminUserinfoBysId(int sId);
	int updateAdminSnackinfo(Snackinfo snackinfo);
	
		List<DoSell> selectSell(String startDate,String endDate);
	
}
