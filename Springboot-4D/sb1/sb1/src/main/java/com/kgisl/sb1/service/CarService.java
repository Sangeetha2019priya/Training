package com.kgisl.sb1.service;


import com.kgisl.sb1.Entity.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<Car> getAllCars();

    Optional<Car> getCarById(int id);

    Car createCar(Car car);

    Optional<Car> updateCar(int id, Car currentCar);

    boolean deleteCar(int id);
}
