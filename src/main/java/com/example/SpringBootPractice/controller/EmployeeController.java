package com.example.SpringBootPractice.controller;

import com.example.SpringBootPractice.dto.EmployeeDto;
import com.example.SpringBootPractice.entity.Employee;
import com.example.SpringBootPractice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody EmployeeDto employeeDto){
        return  employeeService.addEmployee(employeeDto);

    }

    @GetMapping("/employee/getById/{eid}")
    public  Employee getById(@PathVariable Integer eid){
        return  employeeService.getById(eid);
    }

    @DeleteMapping("/employee/deleteById/{eid}")
    public  String deleteById(@PathVariable Integer eid){
        return employeeService.deleteEmployee(eid);
    }

    @PutMapping("/employee/update/{eid}")
    public  Employee updateById(@RequestBody EmployeeDto employeeDto, @PathVariable Integer eid){
        return employeeService.updateEmployee(employeeDto,eid);
    }

}
