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
public class Ejercicio5 {
    private String cadena;
    
    public Ejercicio5(String cadena){
        this.cadena = cadena;
    }

    private String alReves(String original) {
        String nueva = " ";
        for (int i = 0; i < original.length(); i++) {
            nueva = original.charAt(i) + nueva;
        }
        return nueva;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String cadena = sc.nextLine();  
        
        Ejercicio5 nueva = new Ejercicio5(cadena);
        System.out.println(nueva);
    }
}
