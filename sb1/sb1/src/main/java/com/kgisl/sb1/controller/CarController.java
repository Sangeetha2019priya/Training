package com.kgisl.sb1.controller;

import com.kgisl.sb1.Entity.Car;
import com.kgisl.sb1.service.CarServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional; 

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarServiceImp carService;

    @GetMapping("/")
    public ResponseEntity<List<Car>> getAll() {
        List<Car> cars = carService.getAllCars();
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }

    @PostMapping(value = "/", headers = "Accept=application/json")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        Car createdCar = carService.createCar(car);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(createdCar, headers, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Car> getCarById(@PathVariable("id") int id) {
        // try {
            Optional<Car> optionalCar = carService.getCarById(id);
    
            if (optionalCar.isPresent()) {
                return new ResponseEntity<>(optionalCar.get(), HttpStatus.OK);
            } else {
                // Print "Not found" to the console
                System.err.println("Not found");
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        // } catch (Exception e) {
        //     // Handle or log the exception
        //     // System.err.println(e.getMessage());
        //     return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        // }
    }
    

    @PutMapping(value = "/{id}", headers = "Accept=application/json")
    public ResponseEntity<Car> updateCar(@PathVariable("id") int id, @RequestBody Car currentCar) {
        Optional<Car> updatedCar = carService.updateCar(id, currentCar);

        if (updatedCar.isPresent()) {
            return new ResponseEntity<>(updatedCar.get(), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "/{id}", headers = "Accept=application/json")
    public ResponseEntity<Car> deleteCar(@PathVariable("id") int id) {
        boolean deleted = carService.deleteCar(id);

        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
