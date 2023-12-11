import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Registrationn
{
    private int registration_id;
    private int event_id;
    private int athlete_id;
    private Date registration_date;

    public Registrationn(int registration_id, int event_id, int athlete_id, Date registration_date) {
        this.registration_id = registration_id;
        this.event_id = event_id;
        this.athlete_id = athlete_id;
        this.registration_date = registration_date;
    }

    public int getRegistration_id() {
        return registration_id;
    }

    public void setRegistration_id(int registration_id) {
        this.registration_id = registration_id;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public int getAthlete_id() {
        return athlete_id;
    }

 

    public void setAthlete_id(int athlete_id) {
        this.athlete_id = athlete_id;
    }

    public Date getRegistration_date() {
        return registration_date;
    }


    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }


    public static void main(String[] args)
    {
        // Creating sample data
        Registrationn[] registrations = new Registrationn[5];
        registrations[0] = new Registrationn(1, 101, 1001, new Date());
        registrations[1] = new Registrationn(2, 102, 1002, new Date());
        registrations[2] = new Registrationn(3, 103, 1003, new Date());
        registrations[3] = new Registrationn(4, 104, 1004, new Date());
        registrations[4] = new Registrationn(5, 105, 1005, new Date());

 

        // Create a map to store registration_date and count
        Map<Date, Integer> dateCountMap = new HashMap<>();
        // Count registration_date occurrences
        for (Registrationn registrationn : registrations) {
            Date registrationDate = registrationn.getRegistration_date();
            dateCountMap.put(registrationDate, dateCountMap.getOrDefault(registrationDate, 0) + 1);
        }

 

        // Print registration_date and count

        for (Map.Entry<Date, Integer> entry : dateCountMap.entrySet()) {
            Date registrationDate = entry.getKey();
            int count = entry.getValue();
            System.out.println("Registration Date: " + registrationDate + ", Count: " + count);

    }

}

}

 
