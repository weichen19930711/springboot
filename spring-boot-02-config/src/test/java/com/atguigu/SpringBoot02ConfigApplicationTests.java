package com.atguigu;

import com.atguigu.bean.Person;
import com.atguigu.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot单元测试
 * 可以在测试期间
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {

	@Autowired
	private Person person;

	@Autowired
	private HelloService helloService;
	@Autowired
	private ApplicationContext ioc;

	@Test
	public void contextLoads() {
		System.out.println(ioc.containsBean("helloService"));
		System.out.println(helloService);
		System.out.println(person);
	}

}
