package com.example.ecoandrichtest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
/*
* This classes is used to link the tables in the HR schema with a JPA entity.
*
* 이 클래스들은 hr 스키마의 테이블들을 JPA 엔티티와 링크하는 데 사용됩니다.
* */

@Getter
@Setter
@Entity
@Table(name = "countries", schema = "hr")
public class Country {
    /*
    * This fields is used to link columns in the table
    * */

    @Id
    @Column(name = "country_id", nullable = false, length = 2)
    private String countryId;

    @Column(name = "country_name", length = 40)
    private String countryName;
    /*
    * This field is used to link fk columns in the table
    *
    * 이 필드는 테이블의 외래 키 열을 연결하는 데 사용됩니다.
    * */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;

}