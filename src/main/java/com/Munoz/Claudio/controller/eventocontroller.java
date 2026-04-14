package com.Munoz.Claudio.controller;
import.com.Munoz.Claudio.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("api/v1/eventos")


public class Eventocontroller {
@Autowired
private EventoService eventoService;

@GetMapping("Cargar")
public String getcargardatos(@RequestParam String param) {
    return new String();
}



}
