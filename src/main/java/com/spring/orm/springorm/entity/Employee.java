package com.spring.orm.springorm.entity;

import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Data
@Entity
@Transactional
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long empId;
    private String name;
    private int age;
    private String email;
}
