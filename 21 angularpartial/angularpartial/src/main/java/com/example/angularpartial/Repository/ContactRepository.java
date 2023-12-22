package com.example.angularpartial.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.angularpartial.Entity.Contact;


 

public interface ContactRepository  extends JpaRepository<Contact , Integer>{
 
   
}