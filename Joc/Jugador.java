/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en4Raya;

/**
 *
 * @author Gabri
 */
public class Jugador {

    private Color color;
    private String name;
    private int num ;
    
    public Jugador(Color color, String name , int num) {

        this.color = color;
        this.name = name;
        this.num = num;
    }

    public String getName() {

        return name;
    }

    public Color getColor (){
        return color;
    }
    
    public int getNum (){
        return num;
    }
}
