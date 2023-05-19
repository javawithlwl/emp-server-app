package com.careerit.ems.dto;

import lombok.Data;

@Data
public class EmployeeDto {
  private long id;
  private String name;
  private String email;
  private String mobile;
  private float salary;
}
