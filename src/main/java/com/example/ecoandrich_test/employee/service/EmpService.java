package com.example.ecoandrich_test.employee.service;


/*
* This is a class that acts as an intermediary between the Controller and the Repository,
* responsible for handling data processing during data
* creation, retrieval, modification, and deletion operations.
*
* 데이터 생성, 조회, 수정, 삭제시 Controller와 Repo 중간에서 데이터를 정리하는 클래스입니다.
* */

import com.example.ecoandrich_test.employee.repo.EmpJPARepo;
import com.example.ecoandrich_test.entity.Employees;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmpService {
    private final EmpJPARepo empJPARepo;
    /*
    * Retrieval data from employees table by key value.
    * @param id Key in employees table
    *
    * employees 테이블의 key값을 기준으로 데이터를 조회하는 매서드입니다.
    * @param id Employees 테이블의 키값입니다.
    * */
    public Employees findById(Long id) {
        /*
        * JPA를 사용해 데이터를 조회 할 경우 Optional 클래스에 데이터를 담아나오기 때문에
        * .orElse(null)를 사용하였습니다.  (nullexception대비입니다.)
        * */
        return empJPARepo.findById(id).orElse(null);
    }
}
