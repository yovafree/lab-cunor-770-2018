/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase14032018;

import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class Principal {
    static int contador = 0;
    static String[] alumnos = new String[10];
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int op = 0;
        do{
            System.out.println("1) Ingresar alumnos");
            System.out.println("2) Mostrar lista");
            System.out.println("3) Salir");
            System.out.println("Ingrese la opción: ");
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Ingrese el nombre de la persona");
                    String nombre="";
                    nombre = leer.next();
                    agAlumno(nombre);
                    break;
                case 2:
                    System.out.println("---- Listado de alumnos ----");
                    mostrarAlumnos();
                    leer.next();
                    break;
            }
            
        }while(op != 4);
    }
    
    public static void agAlumno(String nombre){
        alumnos[contador] = nombre;
        contador++;
    }
    
    public static void mostrarAlumnos(){
        for(int x=0;x<contador;x++){
            System.out.println(alumnos[x]);
        }
    }
}
