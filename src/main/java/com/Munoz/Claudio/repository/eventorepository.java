package com.Munoz.Claudio.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class eventorepository {
    private List<Evento> events = new ArrayList<>();

    public List<Evento> obtenerEventos() {
        return events;
    }
    public void guardarEventos(Evento event) {
        events.add(event);
    }
    public boolean deleteEvent(int id) {
        return events.removeIf(event -> event.getId() == id);
    }
    
    public void seed() {
        addEvent(new Evento(1, "Concierto de Rock", "2024-07-15", "Madrid"));
        addEvent(new Evento(2, "Feria de Arte", "2024-08-20", "Barcelona"));
        addEvent(new Evento(3, "Festival de Cine", "2024-09-10", "Valencia"));
    }
    public Evento modificarEvento(int id, Evento actualizadoEvento) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getId() == id) {
                events.set(i, actualizadoEvento);
                return actualizadoEvento;
            }
        }
        return null; 
    }
}
