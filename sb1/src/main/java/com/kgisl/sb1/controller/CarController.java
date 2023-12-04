package com.kgisl.sb1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.kgisl.sb1.repository.CarRepository;
import com.kgisl.sb1.Entity.Car;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/")
    public @ResponseBody ResponseEntity<List<Car>> getAll() {
        List<Car> cars = carRepository.findAll();
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }

    @PostMapping(value = "/", headers = "Accept=application/json")
    public ResponseEntity<Car> createCustomer(@RequestBody Car car) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(carRepository.save(car), headers, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Car> getById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(
                carRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found")),
                HttpStatus.OK);
    }

    // @PutMapping(value = "/{id}", headers = "Accept=application/json")
    // public ResponseEntity<Car> updateCar(@PathVariable("id") long id, @RequestBody Car currentCar) {
    //     Car car = carRepository.updateCar(id, currentCar);
    //     return new ResponseEntity<>(car, HttpStatus.OK);
    // }

    @PutMapping(value = "/{id}", headers = "Accept=application/json")
    public ResponseEntity<Car> updateCar(@PathVariable("id") long id, @RequestBody Car updatedCarDetails) {
       
        Car existingCar = carRepository.getCarById(id);
    
        if (existingCar != null) {
           
            Car updatedCar = new Car();
            updatedCar.setId(updatedCarDetails.getId());  // Set the new id
            updatedCar.setName(updatedCarDetails.getName());
            updatedCar.setPrice(updatedCarDetails.getPrice());
    
            Car savedCar = carRepository.save(updatedCar);
    
            carRepository.deleteById(id);
    
            return new ResponseEntity<>(savedCar, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    

    @DeleteMapping(value = "/{id}", headers = "Accept=application/json")
    public ResponseEntity<Car> deleteUser(@PathVariable("id") Long id) {
        Car user = carRepository.getCarById(id);
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        carRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

  
}
