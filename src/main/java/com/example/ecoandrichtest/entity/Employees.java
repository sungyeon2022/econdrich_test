package com.example.ecoandrichtest.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;


@Data
@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employees implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "employee_id", nullable = false)
    @JsonManagedReference
    private Long employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "hire_date", nullable = false)
    private Date hireDate;

    @JoinColumn(name = "job_id", nullable = false)
    @ManyToOne
    @JsonBackReference
    private Job jobId;

    @Column(name = "salary", nullable = false)
    private BigDecimal salary;

    @Column(name = "commission_pct")
    private BigDecimal commissionPct;

    @JoinColumn(name = "manager_id")
    @ManyToOne
    /*
     * The annotation was used to prevent circular references within the same table, where data references each other,
     * to avoid potential cyclic dependencies.
     *
     * 같은 테이블 내의 데이터가 서로를 참조하여 순환참조가 예상되어 이를 막기위해 사용하였습니다.
     * */
    @JsonBackReference
    private Employees managerId;

    @JoinColumn(name = "department_id")
    @ManyToOne
    @JsonBackReference
    private Department departmentId;

}
