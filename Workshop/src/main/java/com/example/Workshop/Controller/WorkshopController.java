package com.example.Workshop.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Workshop.Entity.Workshop;
import com.example.Workshop.Service.WorkshopService;

import java.util.List;

@RestController
@RequestMapping("/workshop")
@CrossOrigin(origins = "http://localhost:4200")
public class WorkshopController {

    @Autowired
    private WorkshopService workshopService;

    @GetMapping
    public ResponseEntity<List<Workshop>> getAllWorkshops() {
        List<Workshop> workshops = workshopService.getAllWorkshops();
        return new ResponseEntity<>(workshops, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Workshop> getWorkshopById(@PathVariable Long id) {
        Workshop workshop = workshopService.getWorkshopById(id);
        return new ResponseEntity<>(workshop, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Workshop> createWorkshop(@RequestBody Workshop workshop) {
        Workshop createdWorkshop = workshopService.createWorkshop(workshop);
        return new ResponseEntity<>(createdWorkshop, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Workshop> updateWorkshop(@PathVariable Long id, @RequestBody Workshop workshop) {
        Workshop updatedWorkshop = workshopService.updateWorkshop(id, workshop);
        return new ResponseEntity<>(updatedWorkshop, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorkshop(@PathVariable Long id) {
        workshopService.deleteWorkshop(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
   
}

