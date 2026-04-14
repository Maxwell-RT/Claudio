package com.Munoz.Claudio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Munoz.Claudio.repository.eventorepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Service
public class EventoService {
@Autowired private eventorepository eventorepository;

public List<Evento> create(Evento evento) {
    return eventorepository.agregar(evento);
}

public List<Evento> readAll() {
    return eventorepository.leertodos();
}




}