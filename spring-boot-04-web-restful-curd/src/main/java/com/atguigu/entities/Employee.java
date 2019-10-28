package com.atguigu.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Employee {
  private Integer id;
  private String lastName;
  private String email;
  private Integer gender;  //1 male, 0 female
  private Department department;
  private Date birth;
  public Employee(Integer id, String lastName, String email, Integer gender,
                  Department department) {
    super();
    this.id = id;
    this.lastName = lastName;
    this.email = email;
    this.gender = gender;
    this.department = department;
    this.birth = new Date();
  }

  public Employee() {
  }
}
