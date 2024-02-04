package com.example.ecoandrich_test.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "departments", schema = "hr")
public class Department {
    @Id
    @Column(name = "department_id", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Column(name = "department_name", nullable = false, length = 30)
    private String departmentName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private Employees manager;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;

}