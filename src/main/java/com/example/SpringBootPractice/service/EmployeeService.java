package com.example.SpringBootPractice.service;

import com.example.SpringBootPractice.dto.EmployeeDto;
import com.example.SpringBootPractice.entity.Employee;

public interface EmployeeService {

    Employee addEmployee(EmployeeDto employeeDto);
    Employee getById(Integer eid);
    String deleteEmployee(Integer eid);
    Employee updateEmployee(EmployeeDto employeeDto, Integer eid);

}
