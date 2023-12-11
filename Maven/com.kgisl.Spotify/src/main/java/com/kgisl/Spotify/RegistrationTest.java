package com.kgisl.Spotify;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
 
public class RegistrationTest {
    static Registration[] registrations = new Registration[25];
 
    public static void main(String[] args) {
       

        setup();  
        printRegistrations();   
        printRegistrationBefore(LocalDate.of(2023, 9, 15)); 
        findDateWithMostRegistrations();  
        bothNames("Championship","Competition");
       
    }
 
    public static void setup() {
 
        // Create an array of Registration objects with sample data
 
        // Sample data entries
        registrations[0] = new Registration(1, "Marathon", "John Doe", LocalDate.of(2023, 10, 1));
        registrations[1] = new Registration(2, "Swimming Competition", "Alice Smith", LocalDate.of(2023, 9, 25));
        registrations[2] = new Registration(3, "Soccer Tournament", "David Johnson", LocalDate.of(2023, 9, 1));
        registrations[3] = new Registration(4, "Tennis Open", "Emily Davis", LocalDate.of(2023, 10, 5));
        registrations[4] = new Registration(5, "Basketball Championship", "Sophia Brown", LocalDate.of(2023, 9, 15));
        registrations[5] = new Registration(6, "Cycling Race", "John Doe", LocalDate.of(2023, 10, 2));
        registrations[6] = new Registration(7, "Gymnastics Show", "Olivia Lee", LocalDate.of(2023, 9, 15));
        registrations[7] = new Registration(8, "Volleyball Tournament", "Ethan Anderson", LocalDate.of(2023, 10, 8));
        registrations[8] = new Registration(9, "Table Tennis Championship", "Alice Smith", LocalDate.of(2023, 9, 22));
        registrations[9] = new Registration(10, "Weightlifting Competition", "Liam Perez", LocalDate.of(2023, 9, 13));
        registrations[10] = new Registration(11, "Running Race", "Chloe Taylor", LocalDate.of(2023, 10, 1));
        registrations[11] = new Registration(12, "High Jump Championship", "Noah Hernandez", LocalDate.of(2023, 9, 30));
        registrations[12] = new Registration(13, "Badminton Tournament", "Grace Scott", LocalDate.of(2023, 10, 10));
        registrations[13] = new Registration(14, "Diving Competition", "Alice Smith", LocalDate.of(2023, 9, 26));
        registrations[14] = new Registration(15, "Archery Contest", "Aria Adams", LocalDate.of(2023, 10, 7));
        registrations[15] = new Registration(16, "Wrestling Championship", "Mia Turner", LocalDate.of(2023, 9, 19));
        registrations[16] = new Registration(17, "Marathon", "Logan Hall", LocalDate.of(2023, 9, 19));
        registrations[17] = new Registration(18, "Karate Tournament", "Aiden White", LocalDate.of(2023, 9, 6));
        registrations[18] = new Registration(19, "Fencing Championship", "Alice Smith", LocalDate.of(2023, 10, 6));
        registrations[19] = new Registration(20, "Shot Put Competition", "Mason King", LocalDate.of(2023, 9, 23));
        registrations[20] = new Registration(21, "Boxing Match", "Layla Turner", LocalDate.of(2023, 10, 9));
        registrations[21] = new Registration(22, "Marathon", "Jackson Green", LocalDate.of(2023, 9, 27));
        registrations[22] = new Registration(23, "Taekwondo Championship", "Harper Allen", LocalDate.of(2023, 10, 8));
        registrations[23] = new Registration(24, "Pole Vault Competition", "Lucas Adams", LocalDate.of(2023, 9, 21));
        registrations[24] = new Registration(25, "Marathon", "Luna Brown", LocalDate.of(2023, 10, 11));
    }

    public static void printRegistrations() {
        System.out.println("List of Registrations:");
        for (Registration registration : registrations) {
            if (registration != null) {
                System.out.println(registration);
            }
        }
    }

    public static void printRegistrationBefore(LocalDate date)
    {
        System.out.println("Registration Before September 15");
        for(Registration registration:registrations)
        {
            if(registration != null && registration.getRegistration_date().isBefore(date))
            {
                System.out.println(registration);
            }
        }
    }

  

    public static void findDateWithMostRegistrations() {
        LocalDate[] registrationDates = new LocalDate[registrations.length];
        int[] dateCounts = new int[registrations.length];

        // Extract registration dates and count occurrences
        for (int i = 0; i < registrations.length; i++) {
            if (registrations[i] != null) {
                LocalDate registrationDate = registrations[i].getRegistration_date();
                registrationDates[i] = registrationDate;
                for (int j = 0; j < registrationDates.length; j++) {
                    if (registrationDate.equals(registrationDates[j])) {
                        dateCounts[j]++;
                    }
                }
            }
        }

        LocalDate dateWithMostRegistrations = null;
        int maxRegistrations = 0;

        // Find the date with the most registrations
        for (int i = 0; i < dateCounts.length; i++) {
            if (dateCounts[i] > maxRegistrations) {
                maxRegistrations = dateCounts[i];
                dateWithMostRegistrations = registrationDates[i];
            }
        }

        if (dateWithMostRegistrations != null) {
            System.out.println("Date with the most event registrations: " + dateWithMostRegistrations);
            System.out.println("Number of registrations on this date: " + maxRegistrations);
        } else {
            System.out.println("No events registered.");
        }
    }



    public static void bothNames(String keyword1,String keyword2)
    {
        System.out.println("Contains both Championship & Competition");
        for(Registration registration:registrations)
        {
            if(registration!=null)
            {
                String name = registration.getEvent_name();
                //System.out.println("Checking event name: " + name);
                if(name.contains(keyword1) && name.contains(keyword2))
                {
                    
                    System.out.println(registration);
                }
            }
        }
    }
}