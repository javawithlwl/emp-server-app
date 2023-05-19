package com.careerit.ems.service;
import com.careerit.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

      EmployeeDto addEmployee(EmployeeDto employeeDto);
      List<EmployeeDto> getAllEmployees();
      EmployeeDto updateEmployee(EmployeeDto employeeDto);
      boolean deleteEmployee(long id);
      EmployeeDto getEmployeeById(long id);
      List<EmployeeDto> search(String str);

}
