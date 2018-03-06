/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase06032018;

import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class Cadenas {
    static String cadena;
    public static void main(String args[]){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un texto");
        
        cadena = leer.nextLine();
        
        for (int x= 0; x<cadena.length();x++){
            System.out.print(cadena.charAt(x));
        }
        System.out.println();
        String pal = "";
        for (int x= cadena.length()-1; x>=0;x--){
            pal = pal + cadena.charAt(x);
        }
        System.out.println("--- PALINDROMO ---");
        if (cadena.equals(pal)){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
    }
}
