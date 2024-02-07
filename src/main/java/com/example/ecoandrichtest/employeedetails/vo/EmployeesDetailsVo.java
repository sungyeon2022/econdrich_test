package com.example.ecoandrichtest.employeedetails.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class EmployeesDetailsVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long employee_id;
    private String job_id;
    private Long manager_id;
    private Long department_id;
    private Long location_id;
    private String country_id;
    private String first_name;
    private String last_name;
    private BigDecimal salary;
    private BigDecimal commission_pct;
    private String department_name;
    private String job_title;
    private String city;
    private String state_province;
    private String country_name;
    private String region_name;
}
