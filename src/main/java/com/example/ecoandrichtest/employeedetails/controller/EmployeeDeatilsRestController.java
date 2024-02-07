package com.example.ecoandrichtest.employeedetails.controller;

import com.example.ecoandrichtest.employeedetails.service.EmployeeDetailsService;
import com.example.ecoandrichtest.employeedetails.vo.EmployeesDetailsVo;
import com.example.ecoandrichtest.exception.DataNotFoundException;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employeedetails")
public class EmployeeDeatilsRestController {
    private final EmployeeDetailsService employeeDetailsService;

    @GetMapping("/search")
    public ResponseEntity<Object> searchEmployeesDetails(@NotNull @RequestParam("Id") String id){
        EmployeesDetailsVo vo = employeeDetailsService.findByEmployeeId(id);
        if(vo == null){
            throw new DataNotFoundException("There is no context");
        }else{
            return new ResponseEntity<>(vo, HttpStatus.OK);
        }
    }
}

