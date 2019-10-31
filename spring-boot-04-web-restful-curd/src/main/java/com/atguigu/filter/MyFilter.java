package com.atguigu.filter;

import javax.servlet.*;

public class MyFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) {
    System.out.println("test...");
  }

  @Override
  public void destroy() {

  }
}
