package com.example.Aop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Aop.Entity.Employee;
import com.example.Aop.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/add/employee", method = RequestMethod.GET)
    public com.example.Aop.Entity.Employee addEmployee(@RequestParam("empId") int empId,
            @RequestParam("firstName") String firstName, @RequestParam("secondName") String secondName) {
        return employeeService.createEmployee(empId, firstName, secondName);
    }

    @RequestMapping(value = "/remove/employee", method = RequestMethod.GET)
    public String removeEmployee(@RequestParam("empId") String empId) {
        employeeService.deleteEmployee(empId);
        return "Employee removed";
    }

    @GetMapping("/")
    public ResponseEntity<List<Employee>> getAll() {
        List<Employee> employee = employeeService.getAllEmployees();
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    
    @GetMapping("/{id}")
public Employee getEmployeeById(@PathVariable int id) {
    Employee employee = employeeService.getEmployeeById(id);
    if (employee != null) {
        return employee;
    } else {
        throw new RuntimeException("Employee not found with id: " + id);
    }
}

    
}

    
