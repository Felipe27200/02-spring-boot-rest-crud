package com.luv2code.springboot.crud_demo.service;

import com.luv2code.springboot.crud_demo.entity.Employee;

import java.util.List;

public interface EmployeeService
{
    List<Employee> findAll();
}
