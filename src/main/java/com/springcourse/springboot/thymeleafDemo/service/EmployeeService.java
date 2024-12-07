package com.springcourse.springboot.thymeleafDemo.service;

import java.util.List;

import com.springcourse.springboot.thymeleafDemo.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
