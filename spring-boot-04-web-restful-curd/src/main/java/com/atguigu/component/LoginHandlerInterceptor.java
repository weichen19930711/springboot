package com.atguigu.component;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    Object currentUser = request.getSession().getAttribute("currentUser");
    if (currentUser == null) {
      request.setAttribute("errorMsg","没有权限请先登陆");
      // 服务器跳转（与之对应的是客户端跳转）
      request.getRequestDispatcher("/index.html").forward(request, response);
      return false;
    } else {
      return true;
    }
  }
}
