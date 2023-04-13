package com.example.tfg_frutosgibaja;

import java.util.Date;

public class Juego {
    private int IdJuego;
    private String NombreJuego;
    private Date Fecha_publicacion;
    private int Valoracion;

    //CONSTRUCTORES
    public Juego(){}
    public Juego(int idJuego, String nombreJuego, Date fecha_publicacion, int valoracion) {
        IdJuego = idJuego;
        NombreJuego = nombreJuego;
        Fecha_publicacion = fecha_publicacion;
        Valoracion = valoracion;
    }

    //SETTERS
    public void setIdJuego(int idJuego) {
        IdJuego = idJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        NombreJuego = nombreJuego;
    }

    public void setFecha_publicacion(Date fecha_publicacion) {
        Fecha_publicacion = fecha_publicacion;
    }

    public void setValoracion(int valoracion) {
        Valoracion = valoracion;
    }
    //GETTERS
    public int getIdJuego() {
        return IdJuego;
    }

    public String getNombreJuego() {
        return NombreJuego;
    }

    public Date getFecha_publicacion() {
        return Fecha_publicacion;
    }

    public int getValoracion() {
        return Valoracion;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "IdJuego=" + IdJuego +
                ", NombreJuego='" + NombreJuego + '\'' +
                ", Fecha_publicacion=" + Fecha_publicacion +
                ", Valoracion=" + Valoracion +
                '}';
    }
}
