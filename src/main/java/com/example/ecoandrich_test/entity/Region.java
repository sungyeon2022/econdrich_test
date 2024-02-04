package com.example.ecoandrich_test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "regions", schema = "hr")
public class Region {
    @Id
    @Column(name = "region_id", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Column(name = "region_name", length = 25)
    private String regionName;

}