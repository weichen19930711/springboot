package com.atguigu.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) {

  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws ServletException, IOException {
    System.out.println("test...");
    filterChain.doFilter(servletRequest, servletResponse);
  }

  @Override
  public void destroy() {

  }
}