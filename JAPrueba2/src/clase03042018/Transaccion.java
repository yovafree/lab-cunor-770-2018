/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase03042018;

import java.util.Date;

/**
 *
 * @author erwin
 */
public class Transaccion {
    public double valor;
    public int tipo; //Débito o crédito
    public Date fec_creacion;
    
    public Transaccion(){}
    
    public Transaccion(double valor, int tipo){
        this.valor = valor;
        this.tipo = tipo;
    }
}
