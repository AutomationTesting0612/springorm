package com.spring.orm.springorm.entity;

import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Data
@Entity
@Transactional
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long empId;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "email")
    private String email;
}
