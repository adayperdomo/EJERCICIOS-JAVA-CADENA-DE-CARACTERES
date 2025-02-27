/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjavacadenacaracteres;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio4 {
    private String frase;
    private int numEspacios;
    
    // Constructor que recibe la frase y cuenta los espacios
    public Ejercicio4(String frase) {
        this.frase = frase;
        this.numEspacios = contarEspacios();
    }
    
    // Método privado para contar los espacios en blanco
    public int contarEspacios() {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++){
            if (Character.isSpaceChar(frase.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba una frase: ");
        String frase = sc.nextLine();
        
        // Se crea el objeto y se realiza el conteo en el constructor
        Ejercicio4 contador = new Ejercicio4(frase);
        System.out.println("Tiene: " + contador.numEspacios + " espacios en blanco");
    }
}

