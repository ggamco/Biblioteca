package com.cice.ejercicio.biblioteca;

import com.cice.ejercicio.biblioteca.encapsulados.Comic;
import com.cice.ejercicio.biblioteca.encapsulados.Disco;
import com.cice.ejercicio.biblioteca.encapsulados.Libro;
import com.cice.ejercicio.biblioteca.encapsulados.primer.orden.Recurso;
import com.cice.ejercicio.biblioteca.interfaces.IPrestable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Recurso> lista = new ArrayList<>();
        List<Boolean> listaStatus = new ArrayList<>();
        Disco disco = new Disco("Disco", "CD", "60", "Warner", "Melendi");

        listaStatus.add(disco.prestar());


        lista.add(disco);
        lista.add(new Comic("AntMan","Enero/18",1L,"Marvel"));
        lista.add(new Libro("El quijote", "1615", "ISBN", "De Bolsillo", "Miguel de Cervantes Saavedra"));

        for (Recurso recurso : lista) {
/*
            IPrestable prestable = (IPrestable) recurso;
            if(prestable.esPrestado()){
                System.out.println(prestable.toString());
            } else {
                System.out.println(prestable.toString());
            }
*/

            if (recurso instanceof IPrestable) {
                System.out.print("PRESTABLE: ");
                if(((IPrestable) recurso).esPrestado()){
                    System.out.println(recurso.toString());
                } else {
                    System.out.println(recurso.toString());
                }
            } else {
                System.out.print("NO PRESTABLE: ");
                System.out.println(recurso.toString());
            }

        }


    }
}
