package com.Munoz.Claudio.model;
import java.util.concurrent.atomic.AtomicInteger;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class eventomodel {
private static final AtomicInteger contador = new AtomicInteger(0);
    
public int id;


@NotBlank (message = "El nombre del evento no puede estar vacío")
@Size (min = 3, max = 70, message = "El nombre del evento debe tener entre 3 y 70 caracteres")
public String nombre;


@NotBlank (message = "La fecha del evento no puede estar vacía")
@Size (min = 10, max = 10, message = "La fecha del evento debe tener el formato DD/MM/AAAA")
public String fecha;



@NotBlank (message = "El nombre del lugar donde se realiza el evento no puede estar vacío")
@Size (min = 3, max = 100, message = "El nombre del lugar donde se realiza el evento debe tener entre 3 y 100 caracteres")
public String lugar;


@Min (value = 1, message = "La capacidad del evento debe ser un número positivo")
@Max (value = 100000, message = "La capacidad del evento no puede exceder los 100000 asistentes")
public int capacidad;


public eventomodel(String nombre, String fecha, String lugar, int capacidad) {
    this.id = contador.incrementAndGet();
    this.nombre = nombre;
    this.fecha = fecha;
    this.lugar = lugar;
    this.capacidad = capacidad;




}









}