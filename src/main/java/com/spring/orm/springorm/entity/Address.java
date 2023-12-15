package com.spring.orm.springorm.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="add_id")
    private int id;

    private String BuildingNo;

    private String state;

    private String country;
}
