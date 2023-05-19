package com.careerit.ems.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class Employee {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private long id;
      @Column(name = "name")
      private String name;
      @Column(name = "email")
      private String email;
      @Column(name = "mobile")
      private String mobile;
      @Column(name = "salary")
      private float salary;

}
