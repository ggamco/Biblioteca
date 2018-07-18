package com.cice.ejercicio.biblioteca.encapsulados;

import com.cice.ejercicio.biblioteca.encapsulados.primer.orden.Publicacion;

public class Comic extends Publicacion {

    private long numero;
    private String coleccion;

    public Comic(String nombre, String fechaPublicacion, long numero, String coleccion) {
        super(nombre, fechaPublicacion);
        this.numero = numero;
        this.coleccion = coleccion;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }
}
