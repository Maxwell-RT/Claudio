package com.Munoz.Claudio.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class eventorepository {
    private List<evento> events = new ArrayList<>();

    public List<evento> getAllEvents() {
        return events;
    }
    public void addEvent(evento event) {
        events.add(event);
    }
    
}
