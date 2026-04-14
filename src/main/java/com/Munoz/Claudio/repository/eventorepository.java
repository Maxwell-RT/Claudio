package com.Munoz.Claudio.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class eventorepository {
    private List<eventos> events = new ArrayList<>();

    public List<eventos> getAllEvents() {
        return events;
    }
    public void addEvent(eventos event) {
        events.add(event);
    }

    public void deleteEvent(int id) {
        events.removeIf(event -> event.getId() == id);
    }
}
