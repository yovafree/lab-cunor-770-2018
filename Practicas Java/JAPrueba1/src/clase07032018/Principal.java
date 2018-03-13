/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase07032018;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

/**
 *
 * @author erwin
 */
public class Principal {
    public static void main(String args[]){
        //AsciiToBin();
        BinToAscii();
    }
    
    public static void AsciiToBin(){
        String palabra = "Hola Mundo";
        String binario = "";
        String binarioCompleto = "";
        for (int x = 0; x<palabra.length();x++){
            //System.out.println((int) palabra.charAt(x) + " = " + palabra.charAt(x));
            
            int num1 = (int) palabra.charAt(x);
            
            binario = "";
            for (int y= 1; y<=8;y++){
                int cos = num1/2;
                int res = num1%2;
                num1 = cos;
                
                if (num1>1){
                    binario =  res + binario;
                }else{
                    binario = 0 + binario;
                }
            }
            binarioCompleto = binarioCompleto + binario + " ";
            
            
        }
        
        System.out.println("Binario: " + binarioCompleto);
    }
    
    public static void BinToAscii(){
        String palabra = "00011110";
        int dec = 0;
        int count = 0;
        for (int y= 7; y>=0;y--){
            int caracter = parseInt(""+ palabra.charAt(y));
            dec = dec + (caracter*((int)(Math.pow(2, count))));
            count = count+1;
        }
        
        System.out.println("Caracter = " + ((char) dec) + " DEC: "  + dec);
    }
}