/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase03042018;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class EstructurasDinamicas {
    static List<String> lstCadenas = new LinkedList<String>() {};
    static List<Persona> lstPersonas = new LinkedList<>();
    
    public static void main(String[] args){
        llenarPersonas();
//        for(Persona item:lstPersonas){
//            System.out.println(item.codigo);
//            System.out.println(item.nombre);
//            System.out.println(item.apellido);
//        }

    
        Persona persona1 = lstPersonas.get(0);
        persona1.agTransaccion(new Transaccion(250,1));
        persona1.agTransaccion(new Transaccion(250,2));
        persona1.agTransaccion(new Transaccion(3500,2));
        persona1.agTransaccion(new Transaccion(680.9,2));
        persona1.verEstado();
        
//        llenarLista();
//        
//        for(String item:lstCadenas){
//            System.out.println("El valor es: " + item);
//        }
        
//        Scanner leer = new Scanner(System.in);
//        
//        String valor = leer.nextLine();
//        
//        lstCadenas.add(valor);
//        
//        for(String item:lstCadenas){
//            System.out.println("El valor es: " + item);
//        }
        
//        System.out.println("POS: " + lstCadenas.indexOf("Raymundo"));
//        
//        System.out.println("VALOR: " + lstCadenas.get(3));
//        
    }
    
    public static void llenarLista(){
        lstCadenas.add("Mario");
        lstCadenas.add("Juan");
        lstCadenas.add("Pedro");
        lstCadenas.add("Raymundo");
    }
    
    public static void llenarPersonas(){
        lstPersonas.add(new Persona(1,"Juan","Zabala"));
        lstPersonas.add(new Persona(2,"Carlos","Zabala"));
        lstPersonas.add(new Persona(3,"Fabio","Requena"));
        lstPersonas.add(new Persona(4,"Renato","Requena"));
        lstPersonas.add(new Persona(5,"José","Paredes"));
        lstPersonas.add(new Persona(7,"Pancracio","Rubalo"));
    }
}
