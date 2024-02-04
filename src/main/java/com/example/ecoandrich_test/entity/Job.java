package com.example.ecoandrich_test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "jobs", schema = "hr")
public class Job {
    @Id
    @Column(name = "job_id", nullable = false, length = 10)
    private String jobId;

    @Column(name = "job_title", nullable = false, length = 35)
    private String jobTitle;

    @Column(name = "min_salary", precision = 8)
    private BigDecimal minSalary;

    @Column(name = "max_salary", precision = 8)
    private BigDecimal maxSalary;

}