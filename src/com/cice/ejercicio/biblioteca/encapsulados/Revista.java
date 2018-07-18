package com.cice.ejercicio.biblioteca.encapsulados;

import com.cice.ejercicio.biblioteca.encapsulados.primer.orden.Publicacion;

public class Revista extends Publicacion {

    private long numero;
    private String periodicidad;

    public Revista(String nombre, String fechaPublicacion, long numero, String periodicidad) {
        super(nombre, fechaPublicacion);
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
}
