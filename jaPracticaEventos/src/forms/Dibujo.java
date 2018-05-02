/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Yova
 * 
 * Extendemos del objeto canvas
 */
public final class Dibujo extends Canvas{
    int tam = 20;
    public int totFil = 17;
    public int totCol = 11;
    public int[][] mat;
    public int cnt = 0;
    // Redimensionamos el objeto
    public Dibujo(){
        this.setSize (450, 450);
        mat = new int[totCol][totFil];
        iniMatriz();
    }
    
    
    public void iniMatriz(){
        for(int x = 0; x<totCol;x++){
            for(int y = 0; y<totFil;y++){
                mat[x][y] = 0;
            }
        }
    }
    
    // Pintamos en nuestro canvas o lienzo
    @Override
    public void paint(Graphics g){
        Color c;
        int posX = 0;
        int posY = 0;
        int cambio = 0;
        for(int y = 0; y<totFil;y++){
            for(int x = 0; x<totCol;x++){
                switch (mat[x][y]) {
                    case 0:
                        g.setColor(Color.GRAY);
                        g.drawRect((tam*x)+100, (tam*y), tam, tam);
                        break;
                    case 1:
                        g.setColor(Color.BLUE);
                        g.fillRect((tam*x)+101, (tam*y)+1, tam, tam);
                        break;
                    case 2:
                        g.setColor(Color.red);
                        g.fillRect((tam*x)+101, (tam*y)+1, tam, tam);
                        break;
                    case 3:
                        g.setColor(Color.ORANGE);
                        g.fillRect((tam*x)+101, (tam*y)+1, tam, tam);
                        break;
                    default:
                        break;
                }
            }
        }
        
    }
}
