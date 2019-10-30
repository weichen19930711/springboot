package com.atguigu.config;

import com.atguigu.component.LoginHandlerInterceptor;
import com.atguigu.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
  private static final List<String> EXCLUDE_PATH= Arrays.asList("/", "/index", "/index.html", "/user/login", "/css/**", "/js/**", "/img/**", "/media/**", "/vendors/**", "/webjars/**", "/asserts/**");

  /*@Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/atguigu").setViewName("success");
  }*/

  @Bean
  public WebMvcConfigurer webMvcConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/atguigu").setViewName("success");
        // 一定会去templates文件夹下寻找 名称为 'login'的静态文件
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("dashboard");
      }

      /*@Override
      public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").
                excludePathPatterns(EXCLUDE_PATH);
      }*/
    };
  }

  @Bean
  public MyLocaleResolver localeResolver() {
    return new MyLocaleResolver();
  }
}
