/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase01032018;

import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @author erwin
 */
public class Lectura {
    
    public static void main(String args[]){
        Scanner lectura = new Scanner(System.in);
        int op;
        do{
            menu();
            op = lectura.nextInt();
            
            switch (op){
                case 1:
                    System.out.println("FIBONACCI");
                    System.out.println("Ingrese la cantidad de números a mostrar: ");
                    int fin = lectura.nextInt();
                    fibonacci(fin);
                    lectura.next();
                    break;
                case 2:
                    System.out.println("Suma de dos números");
                    System.out.println("Ingrese el primer número: ");
                    int num1 = lectura.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    int num2 = lectura.nextInt();
                    
                    System.out.println("El resultado es: " + suma(num1,num2));
                    break;
                case 3:
                    System.out.println("Opción 3");
                    break;
                case 4:
                    System.out.println("Que le vaya bien :P");
                    break;
            }
            if (op != 4)
                System.out.print("\n\n\n\n\n");
            
        }while(op != 4);
        
    }
    
    static void menu(){
        System.out.println("1) FIBONACCI");
        System.out.println("2) Suma de dos números");
        System.out.println("3) Opción 3");
        System.out.println("4) Salir");
        System.out.println("Ingrese la opción...");
    }
    
    static void fibonacci(int fin){
        int a = 1, b = 0;
        for (int x=1;x<=fin;x++){
            System.out.print(b + " ");
            a= a+b;
            b= a-b;
        }
        System.out.print("\n");
    }
    
    static int suma(int num1, int num2){
        return num1+num2;
    }
}
