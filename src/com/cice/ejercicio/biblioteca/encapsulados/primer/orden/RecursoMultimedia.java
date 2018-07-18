package com.cice.ejercicio.biblioteca.encapsulados.primer.orden;

public class RecursoMultimedia extends Recurso{

    private String titulo;
    private String formato;
    private String duracion;

    public RecursoMultimedia() {
    }

    public RecursoMultimedia(String titulo, String formato, String duracion) {
        this.titulo = titulo;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}
