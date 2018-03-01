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
public class Principal3 {
    //Variables Globales y Locales
    
    public static void main(String args[]){
        
        //Ciclo For
        int x;
        for (x = 100; x>=0;x--){
            System.out.print(x + ", ");
        }
        System.out.print("\n");
        
        //Ciclo While
        int m = 0;
        while(m < 100){
            m++;
            System.out.print(m + ", ");
        }
        System.out.print("\n");
        
        //Ciclo Do While
        m = 0;
        do{
            System.out.print(m + ", ");
            m ++;
        }while(m <=100);
    }    
}
