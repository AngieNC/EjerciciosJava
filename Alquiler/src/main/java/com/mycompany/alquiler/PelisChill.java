/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alquiler;

/**
 *
 * @author user
 */
public abstract class PelisChill extends Tienda {
    
    private int id;
    private String titulo;
    private String director;
    private String genero;
    private double precio;
    private boolean peliEspecial;
    private double descuento;

    public PelisChill(int id, String titulo, String director, String genero, double precio, boolean peliEspecial) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.precio = precio;
        this.peliEspecial = peliEspecial;
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
    
    public void setPeliEspecial(boolean peliEspecial) {
        this.peliEspecial = peliEspecial;
    }
    
    public void setDescuento(double descuento) {
        this.descuento = descuento;
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

    public double getDescuento() {
        return descuento;
    }
   
    public boolean isPeliEspecial() {
        return peliEspecial;
    }
    
    // ABSTRACT METHOD
    public abstract String mostrarPelis();

}
