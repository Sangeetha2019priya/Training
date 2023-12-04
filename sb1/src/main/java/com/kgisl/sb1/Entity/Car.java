package com.kgisl.sb1.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Car{

    @Id
    private Long id;

    @Column(name = "Brand_name")
    private String Name;

    @Column(name="price")
    private int price;

    
    public Car() {
    }


    public Car(Long id, String name, int price) {
        this.id = id;
        Name = name;
        this.price = price;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Car [id=" + id + ", Name=" + Name + ", price=" + price + "]";
    }


}
