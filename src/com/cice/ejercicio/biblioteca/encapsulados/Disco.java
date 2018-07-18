package com.cice.ejercicio.biblioteca.encapsulados;

import com.cice.ejercicio.biblioteca.encapsulados.primer.orden.RecursoMultimedia;
import com.cice.ejercicio.biblioteca.interfaces.IPrestable;

public class Disco extends RecursoMultimedia implements IPrestable{

    private String selloDiscografico;
    private String artista;

    //Añadida debido a la implementación de la interfaz. Nada me obliga a crearla salvo la
    //documentación que hayamos podido crear para ayudar a la implementacion por parte del desarrollador.
    private boolean estaPrestado;

    public Disco() {
    }

    public Disco(String titulo, String formato, String duracion, String selloDiscografico, String artista) {
        super(titulo, formato, duracion);
        this.selloDiscografico = selloDiscografico;
        this.artista = artista;
    }

    public String getSelloDiscografico() {
        return selloDiscografico;
    }

    public void setSelloDiscografico(String selloDiscografico) {
        this.selloDiscografico = selloDiscografico;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
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
        return "Disco{" +
                "titulo='" + getArtista() +'\'' +
                ", formato='" + getFormato() +'\'' +
                ", duracion='" + getDuracion() +'\'' +
                ", selloDiscografico='" + selloDiscografico + '\'' +
                ", artista='" + artista + '\'' +
                ", estaPrestado=" + estaPrestado +
                '}';
    }


}
