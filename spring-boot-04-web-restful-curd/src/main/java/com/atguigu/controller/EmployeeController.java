package com.atguigu.controller;

import com.atguigu.dao.EmployeeDao;
import com.atguigu.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmployeeController {

  @Autowired
  private EmployeeDao employeeDao;

  @GetMapping("/emps")
  public String list(Model model) {
    Collection<Employee> all = employeeDao.getAll();
    model.addAttribute("emps", all) ;
    return "emps/list";
  }
}
