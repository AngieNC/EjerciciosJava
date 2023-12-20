/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alquiler;

/**
 *
 * @author user
 */
public class Clientes extends Tienda {

    private String nombre;
    private String correo;
    private String telefono;

    public Clientes(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    // SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    // GET
    public String getNombre() {
        return nombre;
    }
    
    public String getCorreo() {
         return correo;
     }

    public String getTelefono() {
        return telefono;
    }

    

}
