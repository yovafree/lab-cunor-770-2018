/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase06032018;

/**
 *
 * @author erwin
 */
public class Animal {
    public String especie;
    public String color;
    int edad;
    double peso;
    boolean cola; // 1 o 0 1= con cola 0 = sin cola.
    char sexo;
    String raza;
    String tipo_animal;
    public String nombre;
    
    public void mostrar_info(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Raza: " + this.raza);
        System.out.println("Especie: " + this.especie);
        System.out.println("Tipo de animal: " + this.tipo_animal);
        System.out.println("Sexo: " + this.sexo);
    }
    
    
}
