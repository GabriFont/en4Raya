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
public class Fitxa {


      private Color color;
            
    public Fitxa(Color color) {
        
      this.color = color;
        
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
    public Color getColor (){
        
        return color;
    }
    
    public boolean isColor (Color color){
        
        return ( color == getColor() );

    }
    
    public char valorFitxa (){
        
        switch (getColor()){
            case Red : return 'O';
            case Yellow : return 'X';    
            default : return '-';
        }     
    }
    
    
    
    
}
