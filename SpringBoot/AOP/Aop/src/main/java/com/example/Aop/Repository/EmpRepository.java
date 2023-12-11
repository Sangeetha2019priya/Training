package com.example.Aop.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Aop.Entity.*;

import java.util.List;


public interface EmpRepository extends JpaRepository<Employee, Integer> {
    
}