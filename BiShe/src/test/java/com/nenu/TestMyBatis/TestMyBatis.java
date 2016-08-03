package com.nenu.TestMyBatis;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.nenu.pojo.User;
import com.nenu.service.ILoginService;
import com.nenu.service.IRegisterService;
import com.nenu.service.impl.LoginServiceImpl;
import com.nenu.pojo.Group;
import com.nenu.service.IRegisterService;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
//	private ApplicationContext ac = null;
	@Resource
	private IRegisterService registerService = null; 
	
	@Resource
	private ILoginService loginService = null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

	@Test
	public void test1() {
		Group group = registerService.selectByGroupname("东北师范大学");
		logger.info(JSON.toJSONString(group));
	}
	
	@Test
	public void test2() {
		User user = loginService.selectByUsername("林美红");
		logger.info(JSON.toJSONString(user));
	}
	
	@Test
	public void test3() {
		User user = loginService.selectByPrimaryKey(1);
		logger.info(JSON.toJSONString(user));
	}

	@Test
	public void test4() {
		Group group = registerService.selectByPrimaryKey(1);
		logger.info(JSON.toJSONString(group));
	}
}