package com.example.Workshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Workshop.Entity.Workshop;

@Repository
public interface WorkshopRepository extends JpaRepository<Workshop, Long> {
    
}
