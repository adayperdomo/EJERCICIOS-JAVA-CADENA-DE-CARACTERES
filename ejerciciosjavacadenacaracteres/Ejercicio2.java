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
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Primera frase: ");
        String frase1 = sc.nextLine();
        
        System.out.println("Segunada frase");
        String frase2 = sc.nextLine();
        
        int longFrase1 = frase1.length();
        int longFrase2 = frase2.length();
        
        if (longFrase1 == longFrase2) {
            System.out.println("Tienen la misma longitud");
        }else if(longFrase1 < longFrase2){
            System.out.println(frase1 + " es mas corta que " + frase2);
        }else{
            System.out.println(frase2 + " es mas corta que " + frase1);
        }
    }
}
