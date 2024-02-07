package com.example.ecoandrichtest.employee.mapper;

import com.example.ecoandrichtest.employee.vo.EmployeesQueryVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmployeeMapper {
    EmployeesQueryVO findEmployeeById(@Param("empId") String empId);
}
