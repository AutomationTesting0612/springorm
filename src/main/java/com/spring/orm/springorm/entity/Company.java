package com.spring.orm.springorm.entity;

import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.Data;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Entity
@Transactional
@Table(name = "company")
public class Company {

    @Id
    @Column(name = "comp_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CompanyId;

    @Column(name = "company_name")
    private String companyName;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name="emp_id")
    private List<Employee> employee;

//    private Set<String, String> companyMap;
}
