/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 * Clase persona, nos servirá para almacenar información básica.
 * @author erwin
 */
public class Persona {
    public int codigo;
    public String nombre;
    public String telefono;
    
    //Primer constructor, inicializamos con valores predetermidos.
    public Persona(){
        this.codigo = 0;
        this.nombre = "";
        this.telefono = "";
    }
    
    public Persona(int codigo, String nombre, String telefono){
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}
