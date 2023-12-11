package com.kgisl.sb1.service;

import com.kgisl.sb1.Entity.Car;
import com.kgisl.sb1.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(int id) {
        return carRepository.findById(id);
    }

    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    public Optional<Car> updateCar(int id, Car currentCar) {
        Optional<Car> optionalCar = carRepository.findById(id);
        if (optionalCar.isPresent()) {
            Car car = optionalCar.get();
            car.setName(currentCar.getName());
            car.setPrice(currentCar.getPrice());
            return Optional.of(carRepository.save(car));
        } else {
            return Optional.empty();
        }
    }

    public boolean deleteCar(int id) {
        Optional<Car> optionalCar = carRepository.findById(id);
        if (optionalCar.isPresent()) {
            carRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
