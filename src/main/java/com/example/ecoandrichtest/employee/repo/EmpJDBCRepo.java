package com.example.ecoandrichtest.employee.repo;

import com.example.ecoandrichtest.employee.vo.EmployeesQueryVO;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class EmpJDBCRepo {
    private final NamedParameterJdbcTemplate jdbcTemplate;
    private final RowMapper<EmployeesQueryVO> employeesQueryRowMapper = (rs, rownum)->
        new EmployeesQueryVO(
                rs.getLong("employee_id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("email"),
                rs.getString("phone_number"),
                rs.getDate("hire_date"),
                rs.getString("job_id"),
                rs.getBigDecimal("salary"),
                rs.getBigDecimal("commission_pct"),
                rs.getLong("manager_id"),
                rs.getLong("department_id")
        );


}
