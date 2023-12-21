

package com.mycompany.alquiler;

/**
 *
 * @author user
 */
public class Alquiler {

    private Clientes cliente;
    private PelisChill pelicula;

       
    public Alquiler(Clientes cliente, PelisChill pelicula) {
        this.cliente = cliente;
        this.pelicula = pelicula;
    }
    
    // GET
    public Clientes getCliente() {
        return cliente;
    }
    
    public PelisChill getPelicula() {
        return pelicula;
    }
    
    
    // SET
    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public void setPelicula(PelisChill pelicula) {
        this.pelicula = pelicula;
    }
       
    
    
}
