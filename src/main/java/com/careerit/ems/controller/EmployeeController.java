package com.careerit.ems.controller;

import com.careerit.ems.dto.EmployeeDto;
import com.careerit.ems.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {

      private final EmployeeService employeeService;

      @PostMapping
      public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employeeDto){
            return ResponseEntity.ok(employeeService.addEmployee(employeeDto));
      }
      @GetMapping("/all")
      public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
            return ResponseEntity.ok(employeeService.getAllEmployees());
      }
}
