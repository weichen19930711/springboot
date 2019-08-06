package com.atguigu.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Data
@Component
@ConfigurationProperties(prefix = "person")
//@PropertySource(value = {"classpath:person.properties"})
public class Person {
  @Value("${person.last-name}")
  private String lastName;
  @Value("#{11*2}")
  private Integer age;
  private Boolean boss;
  private Date birth;

  private Map<String, String> maps;
  private List<Object> lists;
  private Dog dog;
}
