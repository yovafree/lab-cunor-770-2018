/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase03042018_V2;

/**
 *
 * @author erwin
 */
public class Ordenamiento {
    static int[] numeros = new int[10];
    public static void main(String[] args){
        numeros[0] = 3;
        numeros[1] = 5;
        numeros[2] = 1;
        numeros[3] = 2;
        numeros[4] = 3;
        numeros[5] = 4;
        numeros[6] = 10;
        numeros[7] = 99;
        numeros[8] = 87;
        numeros[9] = 65;
        
        for (int x = 0; x<10;x++){
            System.out.print(" " + numeros[x]);
        }
        
        for (int x = 0; x<10;x++){
            for (int y = x; y<10;y++){
                if (numeros[x] < numeros[y]){
                    int tmp = numeros[x];
                    numeros[x] = numeros[y];
                    numeros[y] = tmp; 
                }
            }
        }
        System.out.print("\n");
        for (int x = 0; x<10;x++){
            System.out.print(" " + numeros[x]);
        }
    }
}
