package com.Munoz.Claudio.controller;
importcom.Munoz.Claudio.service.EventoService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Munoz.Claudio.service.eventoService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("api/v1/eventos")


public class eventocontroller {
@Autowired
private eventoService eventoService;

@GetMapping("Cargar")
public String getcargardatos(@RequestParam String param) {
    return new String();
}

@PostMapping("procesar")
public ResponseEntity<String> postEventoEntity(@RequestBody String entity) {
    //TODO: process POST request
    
    return ResponseEntity.ok(entity);
}

@GetMapping
public List<Evento> getEventos() {
    return eventoService.readAll();
}


@PutMapping("{id}")
public Evento putEvento(@PathVariable String id, @RequestBody Evento entity) {
    //TODO: process PUT request
    
    return eventoService.update(id, entity);
}


}
