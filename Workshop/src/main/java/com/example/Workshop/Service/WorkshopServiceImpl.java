package com.example.Workshop.Service;

import com.example.Workshop.Entity.Workshop;
import com.example.Workshop.Repository.WorkshopRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class WorkshopServiceImpl implements WorkshopService {

    @Autowired
    private WorkshopRepository workshopRepository;

    @Override
    public List<Workshop> getAllWorkshops() {
        return workshopRepository.findAll();
    }

    @Override
    public Workshop getWorkshopById(Long id) {
        Optional<Workshop> optionalWorkshop = workshopRepository.findById(id);
        return optionalWorkshop.orElse(null);
    }

    @Override
    public Workshop createWorkshop(Workshop workshop) {
        return workshopRepository.save(workshop);
    }

    @Override
    public Workshop updateWorkshop(Long id, Workshop workshop) {
        Optional<Workshop> optionalWorkshop = workshopRepository.findById(id);
        if (optionalWorkshop.isPresent()) {
            workshop.setId(id);
            return workshopRepository.save(workshop);
        }
        return null; // Workshop not found
    }

    @Override
    public void deleteWorkshop(Long id) {
        workshopRepository.deleteById(id);
    }
}
