package com.ban.cloud.eureka.server.demo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {
	@RequestMapping(value="/test/date",consumes="application/json",produces="application/json")
	public ModelMap test(@RequestBody TestDateVo param ) {
		ModelMap resultMap = new ModelMap();
		try {
			Date date = param.getStartDate();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			resultMap.put("param", sdf.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//resultMap.put("param", param);
		return resultMap;
	}
	
	@RequestMapping(value="/test/date1",produces="application/json")
	public ModelMap test1() {
		ModelMap resultMap = new ModelMap();
		resultMap.put("param", "hello");
		return resultMap;
	}
}
