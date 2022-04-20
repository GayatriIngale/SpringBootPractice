package com.example.SpringBootPractice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Integer e_id;
    private String e_name;
    private String e_company_name;
    private double e_salary;

}
