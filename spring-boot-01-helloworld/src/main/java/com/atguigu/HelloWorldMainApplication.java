package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ 来标注一个主程序类，说明这是一个springBoot 应用
 *  Spring Boot应用标注在某个类上说明这个类是SpringBoot的主配置类，SpringBoot就应该运行这个类的main方法来启动SpringBoot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

  //
  public static void main(String[] args) {
    SpringApplication.run(HelloWorldMainApplication.class, args);
  }
}
