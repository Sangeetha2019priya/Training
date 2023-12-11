package com.KGiSL.builder.Entity;

public class CarBuilder {
    
    private int id;
    private String Name;
    private int price;
   

    Car car = new Car();

    public CarBuilder() {
    }

    public CarBuilder id(int id) {
        car.setId(id);
        return this;
    }


    public CarBuilder Name(String name) {
        car.setName(name);
        return this;
    }
    

    public CarBuilder Price(int price) {
        car.setPrice(price);
        return this;
    }


    public Car build() {
        return car;
    }
}
