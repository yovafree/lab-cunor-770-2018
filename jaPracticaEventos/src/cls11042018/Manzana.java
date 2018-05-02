/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cls11042018;

import java.util.Date;

/**
 *
 * @author erwin
 */
public class Manzana extends Fruta{
    Date fecCaducidad;
    
    public Manzana(){
        this.setColor("Rojo");
        this.setPeso("0.5");
        this.setSabor("Dulce");
        this.setTamanio("10 cm");
        this.setTextura("Liso");
        this.fecCaducidad = new Date();
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("INFORMACIÓN DE LA MANZANA");
        System.out.println("Color: " + this.getColor());
        System.out.println("Sabor: " + this.getSabor());
        System.out.println("Textura: " + this.getTextura());
        System.out.println("Tamaño: " + this.getTamanio());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Fecha de Caducidad: " + this.fecCaducidad.toLocaleString());
    }
    
    protected void Hola(){
    
    }
}
