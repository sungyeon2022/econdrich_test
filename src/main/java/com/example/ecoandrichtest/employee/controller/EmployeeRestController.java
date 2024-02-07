package com.example.ecoandrichtest.employee.controller;

import com.example.ecoandrichtest.employee.service.EmployeeService;
import com.example.ecoandrichtest.employee.vo.EmployeesQueryVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * This is a controller class that provides APIs for the retrieval and management of employee information.
 * It offers functionalities for creating, retrieving, updating, and deleting employee information, defining endpoints for each operation.
 *
 * 직원 정보 조회 및 관리에 관련된 API를 제공하는 컨트롤러 클래스입니다.
 * 직원 정보의 생성, 조회, 수정, 삭제 기능을 제공하며 각 기능의 엔드포인트를 정의합니다.
 * */

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeRestController {

    private final EmployeeService employeeService;
    /*
     * 사원의 id값을 request로 받고 그 값으로 테이블에서 가져온 데이터를 JsonObject에 담아
     * response합니다.
     * */

    @GetMapping("/searchByIdmyba")
    public ResponseEntity<EmployeesQueryVO> searchByIdmyba(@RequestParam("id") String id) {
        return new ResponseEntity<>(employeeService.findBtIdmyba(id) , HttpStatus.OK);
    }

}
