package org.spring.cloud.eureka.client.user.provider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.cloud.eureka.client.user.provider.dao.mapper.TUserInfoMapper;
import org.spring.cloud.eureka.client.user.provider.dao.model.TUserInfo;
import org.spring.cloud.eureka.client.user.provider.dao.model.TUserInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EurekaClientUserProviderApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class TestJunit {
	@Autowired
	private TUserInfoMapper TUserInfoMapper;
	
	@Test
	public void test() {
		TUserInfo info = new TUserInfo();
		info.setLoginName("zhangsan");
		info.setPwd("123");
		info.setSalt("12345");
		info.setUserName("张三");
		TUserInfoMapper.insertSelective(info);
		System.out.println("插入完毕.");
		TUserInfo info2 = TUserInfoMapper.selectByPrimaryKey(20L);
		System.out.println("查询结果:"+ info2.getLoginName());
	}
}
