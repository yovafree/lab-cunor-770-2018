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
public class Sucesiones {
    public static void main(String args[]){
        long a = 1, b= 0;
        
        for (int x=1;x<30;x++){
            System.out.print(b + " ");
            a = a+b;
            b = a-b;
        }
        
        System.out.print("\n");
        for (int x=0; x<100;x++){
            int cont = 0;
            for (int y=1; y<=x;y++){
                if ((x%y) == 0){
                    cont++;
                }
            }
            if (cont==2 || x == 1){
                System.out.print(x + " ");
            }
        }
    }
}
