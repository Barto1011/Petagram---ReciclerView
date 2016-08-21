package com.barto.petagramweek3;

/**
 * Created by brayhancriollo on 8/19/16.
 */
public class Mascota {

    private String nombre;
    private String ranking;
    private int foto;

    public Mascota(int foto, String nombre, String ranking){
        this.foto       = foto;
        this.nombre     = nombre;
        this.ranking    = ranking;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getRanking() {return ranking;}
    public void setRanking(String ranking) {this.ranking = ranking;}

    public int getFoto() {return foto;}
    public void setFoto(int foto) {this.foto = foto;}
}
