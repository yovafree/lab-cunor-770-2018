package principal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erwin
 */
public class Principal {
    //Creamos un Array de objetos de tipo Persona.
    static ArrayList<Persona> lstPersonas = new ArrayList<>();
    static Scanner leer;
    static int cntCodigo = 1; // Llevará el código único para las personas.
    public static void main(String[] args){
        int op = 0;
        leer = new Scanner(System.in);
        cargarPersonas();
        do{
           System.out.println("Menú");
           System.out.println("1) Agregar persona");
           System.out.println("2) Mostrar personas");
           System.out.println("3) Editar Persona");
           System.out.println("4) Salir");
           System.out.println("Ingrese la opción que desea realizar: ");
           
           op = leer.nextInt();
           
           switch (op){
               case 1:
                   addPersona();
                   break;
               case 2: 
                   mostrarLista();
                   break;
               case 3:
                   System.out.println("Ingrese el código de la persona que desea editar: ");
                   int codPersona = leer.nextInt();
                   editarPersona(codPersona);
                   break;
               case 4:
                   break;
           }
        }while(op != 4);
    }
    
    /**
     * Método que permite agregar una persona a la lista de personas (lstPersonas) de tipo ArrayList.
     */
    public static void addPersona(){
        Persona nueva = new Persona();
        
        nueva.codigo = cntCodigo++;
        System.out.println("Ingrese el nombre de la persona: ");
        nueva.nombre = leer.next();
        System.out.println("Ingrese el número de teléfono: ");
        nueva.telefono = leer.next();
        
        lstPersonas.add(nueva);
    }
    
    /**
     * Muestra la lista de personas
     */
    public static void mostrarLista(){
        System.out.println("\n\n\n---- LISTA DE PERSONAS ----");
        for(Persona item : lstPersonas){
            System.out.println("Código: " + item.codigo);
            System.out.println("Nombre: " + item.nombre);
            System.out.println("Teléfono: " + item.telefono);
            System.out.println("");
        }
        
        try {
            char ch = (char) System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    /**
     * Método que nos permite cargar personas, para no tener una lista vacía al inicio.
     */
    public static void cargarPersonas(){
        lstPersonas.add(new Persona(cntCodigo++, "Manuel Ordoñez", "4556644"));
        lstPersonas.add(new Persona(cntCodigo++, "Juan Gutierrez", "4556644"));
        lstPersonas.add(new Persona(cntCodigo++, "Amilcar Sacul", "4556644"));
        lstPersonas.add(new Persona(cntCodigo++, "Pedro Pablo Jaramillo", "4556644"));
        lstPersonas.add(new Persona(cntCodigo++, "Gudiel Alvarenga", "4556644"));
        lstPersonas.add(new Persona(cntCodigo++, "José Carlos Caal", "4556644"));
    }
    
    public static void editarPersona(int codigo){
        for(Persona item : lstPersonas){
            if (item.codigo == codigo){
                System.out.println("Ingrese el nombre de la persona: ");
                item.nombre = leer.next();
                System.out.println("Ingrese el número de teléfono: ");
                item.telefono = leer.next();
            }
        }
    }
}
