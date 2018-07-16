package com.cice.ejercicio.biblioteca.encapsulados;

public class Libro extends Recurso{

    private String isbn;
    private String edicion;
    private String autor;

    public Libro(String nombre, String fechaPublicacion, String isbn, String edicion, String autor) {
        super(nombre, fechaPublicacion);
        this.isbn = isbn;
        this.edicion = edicion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
