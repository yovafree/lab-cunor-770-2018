/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cls11042018;

/**
 *
 * @author erwin
 */
public class Fruta {
    private String color;
    private String sabor;
    private String textura;
    private String tamanio;
    private String peso;

    public void mostrarInfo(){
        System.out.println("Color: " + this.color);
        System.out.println("Sabor: " + this.sabor);
        System.out.println("Textura: " + this.textura);
        System.out.println("Tamaño: " + this.tamanio);
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
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * @return the textura
     */
    public String getTextura() {
        return textura;
    }

    /**
     * @param textura the textura to set
     */
    public void setTextura(String textura) {
        this.textura = textura;
    }

    /**
     * @return the tamanio
     */
    public String getTamanio() {
        return tamanio;
    }

    /**
     * @param tamanio the tamanio to set
     */
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * @return the peso
     */
    public String getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    
}
