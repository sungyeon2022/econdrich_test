package com.example.ecoandrichtest.employee.vo;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@AllArgsConstructor
public class EmployeesQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long employeeId;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private Date hireDate;

    private String jobId;

    private BigDecimal salary;

    private BigDecimal commissionPct;

    private Long managerId;

    private Long departmentId;

}
