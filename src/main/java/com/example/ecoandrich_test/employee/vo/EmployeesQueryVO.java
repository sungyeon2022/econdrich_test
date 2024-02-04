package com.example.ecoandrich_test.employee.vo;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

@Data
public class EmployeesQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String employeeId;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private Date hireDate;

    private String jobId;

    private BigDecimal salary;

    private BigDecimal commissionPct;

    private String managerId;

    private String departmentId;

}
