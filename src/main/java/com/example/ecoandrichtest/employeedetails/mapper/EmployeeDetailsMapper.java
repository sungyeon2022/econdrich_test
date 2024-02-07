package com.example.ecoandrichtest.employeedetails.mapper;

import com.example.ecoandrichtest.employeedetails.vo.EmployeesDetailsVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmployeeDetailsMapper {
    EmployeesDetailsVo findByEmployeeId(@Param("empId") String employeeId);
}
