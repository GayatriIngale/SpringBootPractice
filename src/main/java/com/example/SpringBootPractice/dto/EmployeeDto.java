package com.example.SpringBootPractice.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDto {

    private Integer e_id;
    private String e_name;
    private String e_company_name;
    private double e_salary;
}
