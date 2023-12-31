package com.kgisl.Spotify;

import java.time.LocalDate;

public class Registration1 {

    private int registration_id;
    private String event_name;
    private String athlete_name;
    private LocalDate registration_date;
    private LocalDate Event_start_date;

public Registration1(int registration_id, String event_name, String athlete_name, LocalDate registration_date,
            LocalDate event_start_date) {
        this.registration_id = registration_id;
        this.event_name = event_name;
        this.athlete_name = athlete_name;
        this.registration_date = registration_date;
        Event_start_date = event_start_date;
    }

public int getRegistration_id() {
    return registration_id;
}

public void setRegistration_id(int registration_id) {
    this.registration_id = registration_id;
}

public String getEvent_name() {
    return event_name;
}

public void setEvent_name(String event_name) {
    this.event_name = event_name;
}

public String getAthlete_name() {
    return athlete_name;
}

public void setAthlete_name(String athlete_name) {
    this.athlete_name = athlete_name;
}

public LocalDate getRegistration_date() {
    return registration_date;
}

public void setRegistration_date(LocalDate registration_date) {
    this.registration_date = registration_date;
}

public LocalDate getEvent_start_date() {
    return Event_start_date;
}

public void setEvent_start_date(LocalDate event_start_date) {
    Event_start_date = event_start_date;
}


    @Override
    public String toString() {
        return "Registration1 [registration_id=" + registration_id + ", event_name=" + event_name + ", athlete_name="
                + athlete_name + ", registration_date=" + registration_date + ",Event_start_date="+"]";

    }


    
}    

 

