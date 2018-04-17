/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cls12042018;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author erwin
 */
public class Dibujo extends Canvas{
    int posX = 130;
    int posY = 0;
    int tam = 15;
    int[][] mat = new int[10][10];
    // Redimensionamos el objeto
    public Dibujo(){
        this.setSize (350, 350);
        for (int x= 0; x<=9;x++){
            for (int y= 0; y<=9;y++){
                if (x==y){
                    mat[x][y]= 1;
                }else{
                    mat[x][y]= 0;
                }
            }
        }
    }
    
    // Pintamos en nuestro canvas o lienzo
    @Override
    public void paint(Graphics g){
        
        Color c;
        g.setColor(Color.DARK_GRAY);
        g.fillRect(10, 10, 100, 330);
        g.setColor(Color.WHITE);
        g.drawString("Marcador", 10, 20);
        g.drawString("Puntos: 0", 10, 35);
        
        for (int x= 1; x<=10;x++){
            for (int y= 1; y<=10;y++){
                if (mat[x-1][y-1] == 1){
                    g.setColor(Color.ORANGE);
                    g.fillRect(posX + (x*tam), posY + (y*tam), tam,tam);
                }else{
                    g.setColor(Color.DARK_GRAY);
                    g.drawRect(posX + (x*tam), posY + (y*tam), tam,tam);
                }
                
            }
        }
        
    }
}
