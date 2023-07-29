package com.spring.orm.springorm.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String email;

}
