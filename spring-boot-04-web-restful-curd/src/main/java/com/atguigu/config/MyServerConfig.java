package com.atguigu.config;

import com.atguigu.filter.MyFilter;
import com.atguigu.listener.MyListener;
import com.atguigu.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
public class MyServerConfig {

  @Bean
  public ServletRegistrationBean myServlet() {
    ServletRegistrationBean<MyServlet> servletRegistrationBean = new ServletRegistrationBean<>(new MyServlet(), "/myServlet");
    return servletRegistrationBean;
  }

  @Bean
  public FilterRegistrationBean myFilter() {
    FilterRegistrationBean<MyFilter> filterRegistrationBean = new FilterRegistrationBean<>(new MyFilter());
    filterRegistrationBean.setUrlPatterns(Arrays.asList("/hello", "/myServlet"));
    return filterRegistrationBean;
  }

  @Bean
  public ServletListenerRegistrationBean myListener() {
    ServletListenerRegistrationBean<MyListener> registrationBean = new ServletListenerRegistrationBean<>(new MyListener());
    return registrationBean;
  }
}
