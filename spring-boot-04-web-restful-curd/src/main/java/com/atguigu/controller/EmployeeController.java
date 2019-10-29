package com.atguigu.controller;

import com.atguigu.dao.DepartmentDao;
import com.atguigu.dao.EmployeeDao;
import com.atguigu.entities.Department;
import com.atguigu.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;

@Controller
public class EmployeeController {

  @Autowired
  private EmployeeDao employeeDao;

  @Autowired
  private DepartmentDao departmentDao;

  @GetMapping("/emps")
  public String list(Model model) {
    Collection<Employee> all = employeeDao.getAll();
    model.addAttribute("emps", all) ;
    return "emps/list";
  }

  @GetMapping("/emp")
  public String toAddPage(Model model) {
    Collection<Department> departments = departmentDao.getDepartments();
    model.addAttribute("depts", departments);
    return "emps/add";
  }

  @PostMapping("/emp")
  public String addEmp(Employee employee) {
    employeeDao.save(employee);
    return "redirect:/emps";
  }
}
