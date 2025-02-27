/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjavacadenacaracteres;

/**
 *
 * @author Alumno
 */
public class Ejercicio1 {
    public static void main(String[] args){
        for (int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++) {
            String xxxx = Integer.toHexString(codePoint); //convierte un número en su representación hexadecimal
            System.out.println("\\u" + xxxx + ":" + codePoint);
        }
    }
}
