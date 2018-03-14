/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase14032018;

/**
 *
 * @author erwin
 */
public class Matrices {
   static int[][] mat = new int[5][5];
    
    public static void main(String[] args){
        
        int pos = 4;
        int posi;
        for (int y = 0; y<5;y++){
            posi= pos-y;
            for (int x = 0; x<5;x++){
                if (x==y)
                    mat[x][y] = 1;
                else if (x==posi)
                    mat[x][y] = 1;
                else
                    mat[x][y] = 0;
            }
        }
        
        for (int y = 0; y<5;y++){
            for (int x = 0; x<5;x++){
                System.out.print(mat[x][y] + " ");
            }
            System.out.print("\n");
        }
    }
}
