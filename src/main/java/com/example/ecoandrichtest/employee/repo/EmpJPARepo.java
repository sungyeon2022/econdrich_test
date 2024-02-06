package com.example.ecoandrichtest.employee.repo;
/*
* This is a repository interface used for retrieving table data using JPA.
*
* 테이블 데이터들을 JPA를 사용해 가져오기 위한 Repo 인터페이스입니다.
* */


import com.example.ecoandrichtest.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface EmpJPARepo extends JpaRepository<Employees, Long> {
}
