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
public class Fruta {
    private String nombre;
    private String color;
    private double peso;
    private String tipo_fruta;
    
    public Fruta(String nombre, String color, double peso, String tipo_fruta){
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.tipo_fruta = tipo_fruta;
    }
    
    public void mostrar(){
        System.out.println("\n----------------");
        System.out.println(getNombre()); 
        System.out.println(getColor()); 
        System.out.println(getPeso()); 
        System.out.println(getTipo_fruta()); 
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the tipo_fruta
     */
    public String getTipo_fruta() {
        return tipo_fruta;
    }

    /**
     * @param tipo_fruta the tipo_fruta to set
     */
    public void setTipo_fruta(String tipo_fruta) {
        this.tipo_fruta = tipo_fruta;
    }
    
    
}
