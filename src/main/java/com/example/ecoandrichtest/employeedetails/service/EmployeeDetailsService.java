package com.example.ecoandrichtest.employeedetails.service;

import com.example.ecoandrichtest.employeedetails.mapper.EmployeeDetailsMapper;
import com.example.ecoandrichtest.employeedetails.vo.EmployeesDetailsVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeDetailsService {
    private final EmployeeDetailsMapper employeeDetailsMapper;

    public EmployeesDetailsVo findByEmployeeId(String empId) {
        return employeeDetailsMapper.findByEmployeeId(empId);
    }
}
