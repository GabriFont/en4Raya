/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en4Raya;
import java.util.Scanner;
/**
 *
 * @author Gabri
 */
public class Joc {
    int x = 6 ;
    int y = 7 ;
    // referncia al tauler
    Tabla taula;

    // matriu de dos jugadors
    Jugador[] jugadors = new Jugador[2];
    // sencer per al torn   ===>   players[torn%2]
    int torn = 1;

    public Joc() {

        // crear el tauler
        taula = new Tabla(x, y);

        // crear els jugadors
        jugadors[0] = new Jugador(Color.Red, "Gabri", 1);
        jugadors[1] = new Jugador(Color.Yellow, "Pep", 2);

    }

    public int obtenerColumna(){
        Scanner s = new Scanner(System.in);
        int n ;
        
        while(true){
            // estaria molt be que comprovassis que la columna no està plena
            // en cas d'estar plena has de donar un missatge d'error i repetir lectura
            System.out.println("Posa el numero de la columna a la que vols introduir la fixa (les columnes van de 0 - 5 )");
            n = s.nextInt();
            if( n >= 0 && n < 6)
               return n; 
        }
    }
    
    public void jugar() {
        
        Fitxa[][] taulaAmbFitxa;
        int columna;
        while (torn < x * y) {  // posar els numeros com a final static

             System.out.println(jugadors[(torn%2) ].getName());
             columna = obtenerColumna();
             taulaAmbFitxa = taula.ficarFitxa(columna, new Fitxa(jugadors[torn%2].getColor()));
             taula.comprobarVertical(columna);

            // deman una columna valida per insertar ( no estigui plena )
            // insert fitxa
            // imprimeixo tauler
            taula.mostraTauler();

            torn++;
        }

    }

}
