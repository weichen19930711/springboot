package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

  @PostMapping("/user/login")
  public String login(@RequestParam("username") String username,
                      @RequestParam("password") String password,
                      Map<String, Object> map, HttpSession httpSession) {
    // 添加重定向，防止二次提交
    if (!StringUtils.isEmpty(username) && "1".equals(password)) {
      httpSession.setAttribute("currentUser", username);
      return "redirect:/main.html";
    } else {
      map.put("errorMsg", "用户名密码不匹配");
      return "login";
    }
  }
}
