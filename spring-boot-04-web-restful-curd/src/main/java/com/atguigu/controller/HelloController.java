package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

  @ResponseBody
  @RequestMapping("/hello")
  public String hello() {
    return "hello";
  }

  @RequestMapping("/success")
  public String success(Map<String, Object> data) {
    data.put("name", "chen");
    data.put("age", "<h3>15</h3>");
    data.put("names", Arrays.asList("chen0", "chen1"));
    return "success";
  }
}
