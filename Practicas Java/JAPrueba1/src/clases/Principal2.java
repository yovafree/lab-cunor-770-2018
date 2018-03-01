/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author erwin
 */
public class Principal2 {
    
    public static void main(String args[]){
        int num1, num2, num3, num4;
        num1 = 3;
        num2 = 4;
        num3 = 7;
        num4 = 3;
        
        if (num1 > num2){
            System.out.println(" Num1");
        }else if(num2 > num3){
            System.out.println(" Num2");
        }
        else if(num3>num4){
            System.out.println(" Num3");
        }
        else{
            System.out.println(" Num4");
        }
        
        int op = 3;
        
        
        switch (op) {
            case 1:
                System.out.println("Opción 1");
                break;
            case 2:
                System.out.println("Opción 2");
                break;
            case 3:
                System.out.println("Opción 3");
                break;
            default:
                System.out.println("Otra opción");
                break;
        }
        
        char letra = 'a';
        
        switch (letra){
            case 'a':
                System.out.println("Opción A");
            break;
            case 'b':
                System.out.println("Opción B");
               break;
            case 'c':
                System.out.println("Opción C");
               break;
        }
        
    }
}
