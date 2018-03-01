/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class Lectura {
    public static void main(String args[]){
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número");
        int num1 = lectura.nextInt();
        
        System.out.println("Ingrese el segundo número");
        int num2 = lectura.nextInt();
        
        System.out.println("La suma es: " + (num1+num2));
    }
}
