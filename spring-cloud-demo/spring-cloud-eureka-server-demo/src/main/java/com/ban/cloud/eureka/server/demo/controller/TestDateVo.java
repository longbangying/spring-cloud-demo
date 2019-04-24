package com.ban.cloud.eureka.server.demo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateVo {
	private  String startDate;

	public Date getStartDate() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.parse(startDate);
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	
}
