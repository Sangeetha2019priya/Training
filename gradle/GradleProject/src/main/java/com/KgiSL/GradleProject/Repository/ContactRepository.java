package com.KgiSL.GradleProject.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.angular.Entity.Contact;
 

public interface ContactRepository  extends JpaRepository<Contact , Integer>{
 
   
}