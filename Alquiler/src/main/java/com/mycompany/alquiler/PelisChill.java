/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alquiler;

/**
 *
 * @author user
 */
public class PelisChill implements OperadoresPelis {

    private int id;
    private String titulo;
    private String director;
    private String genero;
    private double precio;
    

    public PelisChill(int id, String titulo, String director, String genero, double precio, boolean peliEspecial) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.precio = precio;
    }

    // SET
    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // GET
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }


    @Override
    public String mostrarInfo() {
        return "Información sobre la película " + titulo + "  \n Tiene como id:  " + id + "\n Su director es: " + director + "\n Su genero es: " + genero + "\n Su precio de alquiler es: " + precio + "\n Es especial: "; 
    }
    
    
    @Override
    public double calcularPrecio() {
        return 54.128; //Pendiente
    }
    
}
