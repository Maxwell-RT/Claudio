package com.Munoz.Claudio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Service
public class eventoService {
@Autowired private eventoService eventoService;

public list<evento> getAllEvents() {
    return eventoService();



}
