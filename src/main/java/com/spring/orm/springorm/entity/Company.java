package com.spring.orm.springorm.entity;

import lombok.Data;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

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

    @Column(name="company_address")
    private String companyAddress;

//    @OneToOne(cascade = CascadeType.ALL)
//    @Column(name = "add_id")
//    private Address address;

//    private Set<String, String> companyMap;
}
