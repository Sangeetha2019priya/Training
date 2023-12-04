package com.kgisl.sb1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kgisl.sb1.Entity.Car;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findAll();
    Car getCarById(Long id);
}

 
  