package com.careerit.ems.service;

import com.careerit.ems.domain.Employee;
import com.careerit.ems.dto.EmployeeDto;
import com.careerit.ems.repo.EmployeeRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeServiceImpl implements  EmployeeService{

  private final ObjectMapper objectMapper;
  private final EmployeeRepo employeeRepo;

  @Override
  public EmployeeDto addEmployee(EmployeeDto employeeDto) {
    Assert.notNull(employeeDto,"Employee details can't be null");
    Assert.notNull(employeeDto.getName(),"Employee name can't be null");
    Assert.notNull(employeeDto.getEmail(),"Employee email can't be null");
    Employee employee = objectMapper.convertValue(employeeDto, Employee.class);
    employee = employeeRepo.save(employee);
    EmployeeDto savedEmployeeDto = objectMapper.convertValue(employee, EmployeeDto.class);
    log.info("Employee is saved with id : {}",savedEmployeeDto.getId());
    return savedEmployeeDto;
  }

  @Override
  public List<EmployeeDto> getAllEmployees() {
    return null;
  }

  @Override
  public EmployeeDto updateEmployee(EmployeeDto employeeDto) {
    return null;
  }

  @Override
  public boolean deleteEmployee(long id) {
    return false;
  }

  @Override
  public EmployeeDto getEmployeeById(long id) {
    return null;
  }

  @Override
  public List<EmployeeDto> search(String str) {
    return null;
  }
}
