/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baloncesto;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class Baloncesto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Bienvenid@ a la liga de baloncesto");
            System.out.println("Elige la opción que deseas: ");
            System.out.println("1. Partido Liga");
            System.out.println("2. Partido Play Off");
            int opcion = scanner.nextInt(); //Modificar
            
            System.out.println("1. Registrar partido (x: Partido Liga o y: Partido Play Off)");
            System.out.println("2. Registrar datos de partido (x: Partido Liga o y: Partido Play Off)");
            System.out.println("3. Finalizar partido (x: Partido Liga o y: Partido Play Off)");
            System.out.println("4. Mostrar al ganador (x: Partido Liga o y: Partido Play Off)");
            System.out.println("5. Informacion de partido (x: Partido Liga o y: Partido Play Off)");
            
            
        }
        
    }
}
