package com.example.Workshop.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Workshop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String gender;
    private String email;
    private String phoneNumber;
    private String jobTitle;
    private String PaymentMethod;
    private String dietaryRestrictions;
    private Date dateOfRegistration;
    private Date workshopDate;
    private String location;
    private String batch;

    
    public Workshop() {
    }


    public Workshop(Long id, String fullName, String gender, String email, String phoneNumber, String jobTitle,
            String paymentMethod, String dietaryRestrictions, Date dateOfRegistration, Date workshopDate,
            String location, String batch) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.jobTitle = jobTitle;
        this.PaymentMethod = paymentMethod;
        this.dietaryRestrictions = dietaryRestrictions;
        this.dateOfRegistration = dateOfRegistration;
        this.workshopDate = workshopDate;
        this.location = location;
        this.batch = batch;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getFullName() {
        return fullName;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getJobTitle() {
        return jobTitle;
    }


    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    public String getPaymentMethod() {
        return PaymentMethod;
    }


    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }


    public String getDietaryRestrictions() {
        return dietaryRestrictions;
    }


    public void setDietaryRestrictions(String dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }


    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }


    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }


    public Date getWorkshopDate() {
        return workshopDate;
    }


    public void setWorkshopDate(Date workshopDate) {
        this.workshopDate = workshopDate;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public String getBatch() {
        return batch;
    }


    public void setBatch(String batch) {
        this.batch = batch;
    }


    @Override
    public String toString() {
        return "WorkshopEntity [id=" + id + ", fullName=" + fullName + ", gender=" + gender + ", email=" + email
                + ", phoneNumber=" + phoneNumber + ", jobTitle=" + jobTitle + ", PaymentMethod=" + PaymentMethod
                + ", dietaryRestrictions=" + dietaryRestrictions + ", dateOfRegistration=" + dateOfRegistration
                + ", workshopDate=" + workshopDate + ", location=" + location + ", batch=" + batch + "]";
    }


      
}