package com.atguigu.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中(Person类的实例)
 * @ConfigurationProperties： 告诉SpringBoot将本类中的所有属性 和 配置文件中相关的配置进行绑定；
 *      prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 *
 * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
 *  @ConfigurationProperties(prefix = "person") 默认从全局配置文件中获取值；合并application.properties(主) 和application.yml(辅) 文件
 *
 *  application.properties
 *  application.yml
 *  @PropertySource(value = {"classpath:person.properties"})
 */
@Data
@Component
// @PropertySource(value = {"classpath:person.properties"}) // 加载指定的配置文件

// @ConfigurationProperties("person") // 支持松散绑定 person: last_name || person: lastName || person: last_name
// @Validated  开启JSR303数据校验
public class Person {
  @Value("${person.last-name}")// 从环境变量、配置文件中获取值  优先级 application.properties/application.yml/@PropertySource(value = {"classpath:person.properties"})
  private String lastName;
  @Value("#{11*2}") // SpEL
  private Integer age;
  @Value("true")
  private Boolean boss;
  private Date birth;
  @Email(message="邮箱格式错误") // JSR303数据校验
  private String email;
  private Map<String, String> maps;
  private List<Object> lists;
  private Dog dog;
}
