package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ 来标注一个主程序类，说明这是一个springBoot 应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

  //
  public static void main(String[] args) {
    SpringApplication.run(HelloWorldMainApplication.class, args);
  }
}
