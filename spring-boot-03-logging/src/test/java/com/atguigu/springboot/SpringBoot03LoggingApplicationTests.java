package com.atguigu.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot03LoggingApplicationTests {

	private Logger logger = LoggerFactory.getLogger(getClass());
	@Test
	public void contextLoads() {
		// 日志的级别，由低到高
    // 可以指定输出的日志级别 ，比如指定warn，就只输出warn和error级别 的日志
		logger.trace("trace...");// 跟踪
		logger.debug("debug...");// 调试
		logger.info("info...");//
		logger.warn("warn...");// 警告
		logger.error("error...");// 错误
	}

}
