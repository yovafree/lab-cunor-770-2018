/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase06032018;

/**
 *
 * @author erwin
 * Una clase es la definición o descripción de un objeto.
 * ¿Qué es un objeto? Algo que se puede crear, que tiene forma, puede ser abstracto.
 * Un objeto poseee propiedades o atributos, acciones.
 */
public class Principal {
    static Animal animal1, animal2;
    
    public static void main(String args[]){
        animal1 = new Animal();
        // Animal Perro
        animal1.cola =true;
        animal1.color = "Café";
        animal1.edad = 5;
        animal1.especie = "Canino";
        animal1.raza = "Salchicha";
        animal1.nombre = "Churrasco";
        animal1.sexo = 'H';
        animal1.tipo_animal = "Perro";
        
        animal1.mostrar_info();
        
        animal2 = new Animal();
        // Animal Gato
        animal2.cola =true;
        animal2.color = "Canche";
        animal2.edad = 2;
        animal2.especie = "Felino";
        animal2.raza = "Bodoque";
        animal2.nombre = "Misifuz";
        animal2.sexo = 'M';
        animal2.tipo_animal = "Gato";
        
        animal2.mostrar_info();
        
        Fruta fruta1 = new Fruta("Manzana","Rojo",0.3,"Fruta");
        fruta1.mostrar();
        
        Fruta fruta2 = new Fruta("Pera","Verde",0.2,"Fruta");
        fruta2.mostrar();
        
        
    }
}
