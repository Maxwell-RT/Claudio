package com.Munoz.Claudio.controller;
import.com.Munoz.Claudio.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/eventos")


public class Eventocontroller {
@Autowired
private EventoService eventoService;


}
