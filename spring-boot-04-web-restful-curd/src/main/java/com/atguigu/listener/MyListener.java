package com.atguigu.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    System.out.println("Initialized...");
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    System.out.println("Destroyed...");
  }
}
