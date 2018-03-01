/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author erwin
 * Notación Polaca
 */
public class Principal {
    
    
    public static void main(String args[]){
        float num1, num2;
        float res1, res2, res3, res4;
        
        num1 = 12;
        num2 = 35;
        res1 = num1 + num2;
        res2 = num1 - num2;
        res3 = num1 * num2;
        res4 = num1 / num2;
        
        System.out.println("La suma es: " + res1);
        System.out.println("La resta es: " + res2);
        System.out.println("La multiplicación es: " + res3);
        System.out.println("La división es: " + res4);
    }
}
