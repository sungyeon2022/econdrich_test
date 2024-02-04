package com.example.ecoandrich_test.employee.vo;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class EmployeesUpdateVO extends EmployeesVO implements Serializable {
    private static final long serialVersionUID = 1L;

}
