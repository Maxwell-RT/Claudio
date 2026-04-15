package com.Munoz.Claudio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Munoz.Claudio.repository.eventorepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Service
public class eventoService {
@Autowired private eventorepository eventorepository;

public List<Evento> create(Evento evento) {
    return eventorepository.agregar(evento);
}

public List<Evento> readAll() {
    return eventorepository.leertodo();
}
private void seed() {
    eventorepository.seed();

}

public boolean delete(int id) {
    
if (eventorepository.deleteEvent(id)) {
    return "Evento eliminado correctamente"; 
}

    return "Error al eliminar el evento"; 
}

public Evento update(int id, Evento evento) {
    return eventorepository.modificarEvento(id, evento);
}

}