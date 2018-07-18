package com.cice.ejercicio.biblioteca.encapsulados;

import com.cice.ejercicio.biblioteca.encapsulados.primer.orden.Publicacion;
import com.cice.ejercicio.biblioteca.interfaces.IPrestable;

public class Libro extends Publicacion implements IPrestable{

    private String isbn;
    private String edicion;
    private String autor;

    //Añadida debido a la implementación de la interfaz. Nada me obliga a crearla salvo la
    //documentación que hayamos podido crear para ayudar a la implementacion por parte del desarrollador.
    private boolean estaPrestado;

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

    @Override
    public boolean prestar() {

        if (esPrestado()){
            return false;
        } else {
            this.estaPrestado = true;
            return true;
        }

    }

    @Override
    public boolean devolver() {
        if (!esPrestado()){
            return false;
        } else {
            this.estaPrestado = false;
            return true;
        }
    }

    @Override
    public boolean esPrestado() {
        return this.estaPrestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + getNombre() + '\'' +
                ", fechaPublicacion='" + getFechaPublicacion() + '\'' +
                ", isbn='" + isbn + '\'' +
                ", edicion='" + edicion + '\'' +
                ", autor='" + autor + '\'' +
                ", estaPrestado=" + estaPrestado +
                "} " + super.toString();
    }
}
