/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en4Raya;

import java.awt.Color;

/**
 *
 * @author Gabri
 */
public class Tabla {

    private Fitxa[][] tauler;
    int x;
    int y;

    public Tabla(int x, int y) {

        this.x = x;
        this.y = y;
        this.tauler = new Fitxa[x][y];

    }

    public int posicioFicarFitxa(int columna) {

        for (int i = y - 1; i >= 0; i--) {
            if (tauler[columna][i] == null) {
                return i;
            }
        }
        return -1;
    }

    public Fitxa[][] ficarFitxa(int columna, Fitxa fitxa) {

        int posicioCorrecte = posicioFicarFitxa(columna);

        if (posicioCorrecte >= 0) {
            tauler[columna][posicioCorrecte] = fitxa;
        }
        return tauler;
    }

    public void mostraTauler() {

        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                if (tauler[i][j] == null) {
                    System.out.print('-');
                } else {
                    System.out.print(tauler[i][j].valorFitxa());
                }
            }
            System.out.println("");
        }
    }

    public boolean comprobarVertical(int columna) {
        boolean v = false;
        int num = 0;
        int p = y - 1;
        

        while (tauler[columna][p] == null && p >= 3){
            p--;
        }
        if (p >= 3){
            for (int i = p , j = p ; i <= 0; i--) {
                if (tauler[columna][i].getColor() == tauler[columna][j].getColor()){
                    num++;
                }          
                else{
                    num = 0;
                    j--;
                }
                if(num == 4){
                    System.out.println("Vicotria");
                    return v = true;
                }
            }
        }
        return v;
    }
    
    
            /*
        boolean victoria = false;
        int pos = posicioFicarFitxa(columna);
        int v = 0;
        int c = 3;

        while (true) {
            if (c >= 0) {
                return victoria;
            } else {
                for (int i = pos - c, j = pos - c; i <= pos + 3; i++) {
                    if (tauler[columna][i].getColor() == tauler[columna][j].getColor()) {
                        v++;
                    } else {
                        v = 0;
                        j++;
                    }
                    if (v == 4) {
                        System.out.println("Victoria");
                        return victoria = true;
                    }
                }
            }
            c--;
            return victoria;
        }

    }*/
}
