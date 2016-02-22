package com.zhouyun.search.house.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhouyun.search.house.model.User;
import com.zhouyun.search.house.service.UserService;

public class UserTest {
	
	private UserService userService;
	
	@Before
	public void before() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"classpath:conf/spring-context.xml", "classpath:conf/spring-mybatis.xml"});
		userService = (UserService) context.getBean("userServiceImpl");
	}

	@Test
	public void addUser() {
		User user = new User();
		Date now = new Date();
		user.setId("aaaaaaaa");
		user.setUsername("zhouyun");
		user.setNickname("BigBigBoy");
		user.setBirthday(now);
		user.setMale(true);
		user.setCreateTime(now);
		user.setUpdateTime(now);
		userService.insert(user);
	}
}
