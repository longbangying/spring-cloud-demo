package org.spring.cloud.eureka.client.user.provider.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.spring.cloud.eureka.client.user.provider.dao.model.TUser;
import org.spring.cloud.eureka.client.user.provider.service.face.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {
	/*@Autowired
	private TUserInfoMapper TUserInfoMapper;*/
	
	@Autowired
	UserService UserService;
	
	@RequestMapping(value="/info",produces="application/json")
	public ModelMap getServerInfo(HttpServletRequest request){
		System.out.println(request.getLocalPort());
		ModelMap  resultMap = new ModelMap();
		resultMap.put("SERVER-NAME","spring-cloud-eureka-client-user-provider"+ request.getLocalPort());
		return resultMap;
	}
	
	@RequestMapping(value="/test",produces="application/json")
	public ModelMap test() {
		ModelMap  resultMap = new ModelMap();
		TUser  info = new TUser();
		info.setCreateTime(new Date());
		info.setLoginId("longbangying");
		info.setPassword("1232323");
	
		info.setUserName("longbangying");
		UserService.insertSelective(info);
		resultMap.put("data", info);
		//throw new RuntimeException("1222222");
		return resultMap;
	}
	
}
