/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase03042018;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erwin
 */
public class Persona {
    public int codigo;
    public String nombre;
    public String apellido;
    public List<Transaccion> transacciones;
    
    public Persona(){
        transacciones = new ArrayList<>();
    }
    
    public Persona(int codigo, String nombre, String apellido){
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        transacciones = new ArrayList<>();
    }
    
    public void agTransaccion(Transaccion trans){
        transacciones.add(trans);
    }
    
    public void verEstado(){
        double total = 0;
        for (Transaccion trans: transacciones){
            if (trans.tipo == 1)
                total -=trans.valor;
            else
                total +=trans.valor;
        }
        
        System.out.println("El total es: Q" + total);
    }
}
