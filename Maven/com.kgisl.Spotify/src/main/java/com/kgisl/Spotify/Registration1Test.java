package com.kgisl.Spotify;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

 
public class Registration1Test {
     static ArrayList<Registration1> registrations = new ArrayList<>();
 
    public static void main(String[] args) {
        setup();      
       // System.out.println(registrations);
       print();  
        findAthletesWithMultipleRegistrations();
       athletesRegisteredAfterEventStart();
       
     

       Map<String, Integer> eventsByMonth = countEventsByMonth(registrations);


    for (Entry<String, Integer> entry : eventsByMonth.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue() + " events");
    }
        
    }
    public static Map<String, Integer> countEventsByMonth(ArrayList<Registration1> registrations) {
 
        Map<String, Integer> eventsByMonth = new HashMap<>();
    
        for (Registration1 registration : registrations) {
            LocalDate registrationDate = registration.getRegistration_date();
            String month = registrationDate.getMonth().toString();
    
            eventsByMonth.put(month, eventsByMonth.getOrDefault(month, 0) + 1);
        }
    
        return eventsByMonth;
    }
    
 
    public static void setup() {
 
        // Create an array of Registration objects with sample data
 
        // Sample data entries
       registrations.add(new Registration1(1, "Marathon", "John Doe", LocalDate.of(2023, 10, 1),LocalDate.of(2023, 10, 2)));
        registrations.add(new Registration1(2, "Swimming Competition", "Alice Smith", LocalDate.of(2023, 9, 25),LocalDate.of(2023,9,23)));
        registrations.add(new Registration1(3, "Soccer Tournament", "David Johnson", LocalDate.of(2023, 9, 1),LocalDate.of(2023, 9, 2)));
        registrations.add(new Registration1(4, "Tennis Open", "Emily Davis", LocalDate.of(2023, 10, 5),LocalDate.of(2023, 10, 2)));
        registrations.add(new Registration1(5, "Basketball Championship", "Sophia Brown", LocalDate.of(2023, 9, 15),LocalDate.of(2023, 9, 16)));
        registrations.add(new Registration1(6, "Cycling Race", "John Doe", LocalDate.of(2023, 10, 2),LocalDate.of(2023, 10, 1)));
        registrations.add(new Registration1(7, "Gymnastics Show", "Olivia Lee", LocalDate.of(2023, 9, 15),LocalDate.of(2023, 9, 16)));
        registrations.add(new Registration1(8, "Volleyball Tournament", "Ethan Anderson", LocalDate.of(2023, 10, 8),LocalDate.of(2023, 10, 6)));
        registrations.add(new Registration1(9, "Table Tennis Championship", "Alice Smith", LocalDate.of(2023, 9, 22),LocalDate.of(2023, 9, 23)));
        registrations.add(new Registration1(10, "Weightlifting Competition", "Liam Perez", LocalDate.of(2023, 9, 13),LocalDate.of(2023, 9, 15)));
        registrations.add(new Registration1(11, "Running Race", "Chloe Taylor", LocalDate.of(2023, 10, 1),LocalDate.of(2023, 9, 28)));
        registrations.add(new Registration1(12, "High Jump Championship", "Noah Hernandez", LocalDate.of(2023, 9, 30),LocalDate.of(2023, 9, 15)));
        registrations.add(new Registration1(13, "Badminton Tournament", "Grace Scott", LocalDate.of(2023, 10, 10),LocalDate.of(2023, 10, 15)));
        registrations.add(new Registration1(14, "Diving Competition", "Alice Smith", LocalDate.of(2023, 9, 26),LocalDate.of(2023, 9, 27)));
        registrations.add(new Registration1(15, "Archery Contest", "Aria Adams", LocalDate.of(2023, 10, 7),LocalDate.of(2023, 10, 15)));
        registrations.add(new Registration1(16, "Wrestling Championship", "Mia Turner", LocalDate.of(2023, 9, 19),LocalDate.of(2023, 9, 15)));
        registrations.add(new Registration1(17, "Marathon", "Logan Hall", LocalDate.of(2023, 9, 19),LocalDate.of(2023, 9, 20)));
        registrations.add(new Registration1(18, "Karate Tournament", "Aiden White", LocalDate.of(2023, 9, 6),LocalDate.of(2023, 9, 15)));
        registrations.add(new Registration1(19, "Fencing Championship", "Alice Smith", LocalDate.of(2023, 10, 6),LocalDate.of(2023, 10, 15)));
        registrations.add(new Registration1(20, "Shot Put Competition", "Mason King", LocalDate.of(2023, 9, 23),LocalDate.of(2023, 9, 15)));
        registrations.add(new Registration1(21, "Boxing Match", "Layla Turner", LocalDate.of(2023, 10, 9),LocalDate.of(2023, 9, 15)));
        registrations.add(new Registration1(22, "Marathon", "Jackson Green", LocalDate.of(2023, 9, 27),LocalDate.of(2023, 9, 28)));
        registrations.add(new Registration1(23, "Taekwondo Championship", "Harper Allen", LocalDate.of(2023, 10, 8),LocalDate.of(2023, 10, 15)));
        registrations.add(new Registration1(24, "Pole Vault Competition", "Lucas Adams", LocalDate.of(2023, 9, 21),LocalDate.of(2023, 9, 15)));
        registrations.add(new Registration1(25, "Marathon", "Luna Brown", LocalDate.of(2023, 10, 11),LocalDate.of(2023, 10, 15)));
    }

    public static void print()
    {
        for(Registration1 registration:registrations)
        {
            System.out.println(registration);
        }
    }
    
    public static void findAthletesWithMultipleRegistrations() {
        HashMap<String, HashSet<String>> athleteEvents = new HashMap<>();

        for (Registration1 registration : registrations) {
            String athleteName = registration.getAthlete_name();
            String eventName = registration.getEvent_name();

          
            if (athleteEvents.containsKey(athleteName)) {
                
                athleteEvents.get(athleteName).add(eventName);
            } else {
                HashSet<String> events = new HashSet<>();
                events.add(eventName);
                athleteEvents.put(athleteName, events);
            }
        }

        // Print athletes who registered for more than one event
        System.out.println("Athletes who registered for more than one event:");
        for (String athlete : athleteEvents.keySet()) {
            HashSet<String> events = athleteEvents.get(athlete);
            if (events.size() > 1) {
                System.out.println(athlete + " registered for events: " + events);
            }
        }
    }

    public static void athletesRegisteredAfterEventStart() {
        System.out.println("Athletes who registered for an event after the event started:");
        
        for (Registration1 registration : registrations) {
            LocalDate registrationDate = registration.getRegistration_date();
            LocalDate eventStartDate = registration.getEvent_start_date();
            // System.out.println(registrationDate);

            if (registrationDate != null && eventStartDate != null) 
            {
            if (registrationDate.isAfter(eventStartDate)) {
                System.out.println(registration.getAthlete_name() + " registered for " + registration.getEvent_name() + " after the event started.");
              // System.out.println(registration);
            }
        }
    }
}


}


