package com.example.Workshop.Service;

import com.example.Workshop.Entity.Workshop;

import java.util.Date;
import java.util.List;

public interface WorkshopService {

    List<Workshop> getAllWorkshops();

    Workshop getWorkshopById(Long id);

    Workshop createWorkshop(Workshop workshop);

    Workshop updateWorkshop(Long id, Workshop workshop);

    void deleteWorkshop(Long id);
}