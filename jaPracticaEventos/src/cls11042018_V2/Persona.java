/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cls11042018_V2;

/**
 *
 * @author erwin
 */
public class Persona {
    String nombres;
    String apellidos;
    String contrasenia;
    String usuario;
    
    public Persona(String nombres, String apellidos, String usuario, String contrasenia){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contrasenia = contrasenia;
        this.usuario = usuario;
    }
}
