/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.alquiler;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class Main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenid@ a la tienda PelisChill");
        System.out.println("*********************************");
        System.out.println("1. Registrar peliculas");
        System.out.println("2. Registrar clientes");
        System.out.println("3. Alquiler de pelicula");
        System.out.println("4. Mostrar información del alquiler");
        System.out.println("5. Cambio de precio de una pelicula");
        System.out.println("6. Eliminar una pelicula");
        System.out.println("**********************************");
        System.out.println("Elija una opción: ");
        int opcion = scanner.nextInt();
        
        
    }
    
}
