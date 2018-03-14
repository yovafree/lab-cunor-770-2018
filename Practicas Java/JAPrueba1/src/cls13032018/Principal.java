
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cls13032018;

import static java.lang.Integer.parseInt;

/**
 *
 * @author erwin
 */
public class Principal {
    public static void main(String args[]){
        
        // BINARIO A HEXADECIMAL
        /*
        String palabra = "01010101 01011111 01110101 00010001 00010101 00000101 01010100";
        String[] arrPalabras = palabra.split(" ");
        
        for (int x = 0; x< arrPalabras.length;x++){
            System.out.println("Pos" + x + " " + arrPalabras[x] + " = " + DecToHex(BinToDec(arrPalabras[x])));
        }
        */
        
        // ASCII A HEXADECIMAL
        /*
        String palabra = "Este es un mensaje cifrado.";
        String salida="";
        for (int x= 0; x<palabra.length();x++){
            int caracter = (int) palabra.charAt(x);
            salida = salida + DecToHex(caracter) + " ";
        }
        System.out.println("Mensaje Hexadecimal: \n" + salida);
        */
        
        // HEXADECIMAL A ASCII
        
        String palabra = "45 73 74 65 20 65 73 20 75 6E 20 6D 65 6E 73 61 6A 65 20 63 69 66 72 61 64 6F 2E";
        String[] arrPalabras = palabra.split(" ");
        String salida = "";
        for (int x = 0; x< arrPalabras.length;x++){
            salida =  salida + ((char)HexToDec(arrPalabras[x]));
            
        }
        System.out.println(salida);
        
    }
    
    /**
     * Función para convertir de decimal a binario
     * @param num1
     * @return 
     */
    public static String DecToBin(int num1){
            String binario = "";
            for (int y= 1; y<=8;y++){
                int cos = num1/2;
                int res = num1%2;
                num1 = cos;
                
                if (num1>1){
                    binario =  res + binario;
                }else if(num1==1){
                    binario =  1 + binario;
                }
                else{
                    binario = 0 + binario;
                }
            }
        return binario;
    }
    
    /**
     * Función para convertir de Binario a Ascii
     * @param palabra
     * @return 
     */
    public static String BinToAscii(String palabra){
        int dec = 0;
        int count = 0;
        for (int y= 7; y>=0;y--){
            int caracter = parseInt(""+ palabra.charAt(y));
            dec = dec + (caracter*((int)(Math.pow(2, count))));
            count = count+1;
        }
        
        return "" + ((char) dec);
    }
    
    /**
     * Función para convertir de Binario a Decimal
     * @param palabra
     * @return 
     */
    public static int BinToDec(String palabra){
        int dec = 0;
        int count = 0;
        for (int y= 7; y>=0;y--){
            int caracter = parseInt(""+ palabra.charAt(y));
            dec = dec + (caracter*((int)(Math.pow(2, count))));
            count = count+1;
        }
        
        return dec;
    }
    
    /**
     * Función para convertir de Decimal a Hexadecimal
     * @param numero
     * @return 
     */
    public static String DecToHex(int numero){
        String hexa = "0123456789ABCDEF";
        
        int cos = numero/16;
        int res = numero%16;
        
        return "" + hexa.charAt(cos) + hexa.charAt(res);
    }
    
    /**
     * Función para convertir de Hexadecimal a Decimal
     * @param valor
     * @return 
     */
    public static int HexToDec(String valor){
        String hexa = "0123456789ABCDEF";
        double dec = 0;
        int count = 0;
        for (int x=valor.length()-1; x>=0;x--){
            int pos = 0;
            for (int y = 0; y<hexa.length();y++){
                if (valor.charAt(x) == hexa.charAt(y)){
                    pos = y;
                }
            }
            
            dec = dec+ (pos * Math.pow(16, count));
            count++;
        }
        int retorno = (int) dec;
        return retorno;
    }
}


