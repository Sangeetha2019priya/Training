package com.KGiSL.builder.Entity;



/**
 * Hello world!
 *
 */

public class Car 
{
    private int id;
    private String Name;
    private int price;

    public Car(int id, String name, int price) {
        this.id = id;
        Name = name;
        this.price = price;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

 

}

