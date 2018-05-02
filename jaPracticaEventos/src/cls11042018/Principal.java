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
public class Principal {
    
    public static void main(String[] args){
        Manzana manzana1 = new Manzana();
        System.out.println(manzana1.getColor());
        manzana1.mostrarInfo();
        ManzanaDurazno manzana2 = new ManzanaDurazno();
        manzana2.mostrarInfo();
    }
}
