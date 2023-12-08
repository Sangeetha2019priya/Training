package com.example.Aop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Aop.Entity.Employee;
import com.example.Aop.Repository.EmpRepository;

@Service
public class EmployeeService {

     @Autowired
    private EmpRepository employeeRepository; 

    public Employee createEmployee(int empId, String fname, String sname) {
        Employee emp = new Employee();
        emp.setEmpId(empId);
        emp.setFirstName(fname);
        emp.setSecondName(sname);
        return emp;
    }

    public void deleteEmployee(String empId) {
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll(); 
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }
      
    }

      

