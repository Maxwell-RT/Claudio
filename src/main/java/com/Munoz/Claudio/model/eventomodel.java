package com.Munoz.Claudio.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Eventomodel {
    public String nombre;
    public String fecha;
    public String lugar;
    public int capacidad;

}
