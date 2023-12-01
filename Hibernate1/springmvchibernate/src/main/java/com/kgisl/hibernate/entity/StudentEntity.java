package com.kgisl.hibernate.entity;


import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;


@Entity
@Table(name = "student")
public class StudentEntity {

    @Id
   
    private int s_id;

   
    private String s_name;
  

    private int s_age;

  
    private String s_description; 
    @OneToOne(cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn
    private courseEntity course;

    public StudentEntity(int s_id, String s_name, int s_age, String s_description) {
        super();
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_age = s_age;
        this.s_description = s_description;
    }

    public StudentEntity() {
        super();
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getS_age() {
        return s_age;
    }

    public void setS_age(int s_age) {
        this.s_age = s_age;
    }

    public String getS_description() {
        return s_description;
    }

    public void setS_description(String s_description) {
        this.s_description = s_description;
    }
  

}