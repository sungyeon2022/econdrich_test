package com.example.ecoandrich_test.employee.vo;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
@Data
public class EmployeesVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "employeeId can not null")
    private String employeeId;

    private String firstName;

    @NotNull(message = "lastName can not null")
    private String lastName;

    @NotNull(message = "email can not null")
    private String email;

    private String phoneNumber;

    @NotNull(message = "hireDate can not null")
    private Date hireDate;

    @NotNull(message = "jobId can not null")
    private String jobId;

    @NotNull(message = "salary can not null")
    private BigDecimal salary;

    private BigDecimal commissionPct;

    private String managerId;

    private String departmentId;

}
