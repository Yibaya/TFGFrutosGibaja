package com.example.tfg_frutosgibaja;

import java.time.Year;
import java.util.ArrayList;

public class Juego {

    public static ArrayList<Juego> juegoArrayList = new ArrayList<>();
    private int id;
    private String nombre;

    private Year anio;
    private String genero;
    private String compania;
    private String plataforma;

    public Juego(){ }
    public Juego(int id, String nombre, String genero, String compania, String plataforma) {
        this.id = juegoArrayList.size()+1;
        this.nombre = nombre;
        this.genero = genero;
        this.compania = compania;
        this.plataforma = plataforma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Year getAnio() {
        return anio;
    }

    public void setNombre(Year anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
