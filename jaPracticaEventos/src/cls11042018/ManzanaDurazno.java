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
public class ManzanaDurazno extends Manzana{
    public ManzanaDurazno(){
        this.setColor("Rojo amarillento");
        this.setPeso("0.4");
        this.setSabor("Dulce con sabor a durazno");
        this.setTamanio("8 cm");
        this.setTextura("Liso");
        this.fecCaducidad = new Date();
    }
}
