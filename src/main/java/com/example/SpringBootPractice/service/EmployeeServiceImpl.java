package com.example.SpringBootPractice.service;

import com.example.SpringBootPractice.dto.EmployeeDto;
import com.example.SpringBootPractice.entity.Employee;
import com.example.SpringBootPractice.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements  EmployeeService{
    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public Employee addEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setE_id(employeeDto.getE_id());
        employee.setE_name(employeeDto.getE_name());
        employee.setE_company_name(employeeDto.getE_company_name());
        employee.setE_salary(employeeDto.getE_salary());
        employeeRepo.save(employee);
        return employee;
    }

    @Override
    public Employee getById(Integer eid) {
        Employee employee = new Employee();
        employee = employeeRepo.getById(eid);
        return employee;
    }

    @Override
    public String deleteEmployee(Integer eid) {
        employeeRepo.deleteById(eid);
        return "Employee Deleted Succesfully";
    }

    @Override
    public Employee updateEmployee(EmployeeDto employeeDto, Integer eid) {
        Employee employee = new Employee();
        employee = employeeRepo.findById(eid).get();
        employee.setE_id(employeeDto.getE_id());
        employee.setE_name(employeeDto.getE_name());
        employee.setE_company_name(employeeDto.getE_company_name());
        employee.setE_salary(employeeDto.getE_salary());
        employeeRepo.save(employee);

        return employee;
    }
}
