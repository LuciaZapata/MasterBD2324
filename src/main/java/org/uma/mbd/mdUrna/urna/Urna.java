package org.uma.mbd.mdUrna.urna;
import java.util.NoSuchElementException;
import java.util.Random;

// Creamos la clase Urna:
public class Urna {

    // Defimos las variables de estado de la clase Urna:
    public enum ColorBola {Blanca, Negra}
    public String ParImpar;
    private int blancas, negras;
    final private static Random alea = new Random();

    // Definimos el constructor de la clase Urna:
    public Urna(int nB, int nN) {
        if (nB < 0 || nN < 0 )
            throw new IllegalArgumentException("Cuidado, has introducido un número negativo de bolas.");
        blancas = nB;
        negras = nN;
    }

    // Definimos los métodos de la clase Urna:
    public int totalBolas(){ return blancas + negras; }

    public ColorBola extraerBola() {
        if (totalBolas() == 0){
            throw new NoSuchElementException("No quedan bolas.");
        }
        ColorBola bolaExtraida;
        int numAlea = alea.nextInt(totalBolas())+1;
        if ( numAlea <= blancas) {
            bolaExtraida = ColorBola.Blanca;
            blancas--;
            ParImpar = "par";
        } else {
            bolaExtraida = ColorBola.Negra;
            negras--;
            ParImpar = "impar";
        }
        return bolaExtraida;
    }

    public void ponerBlanca(){ blancas++; }
    public void ponerNegra(){ negras++; }

    // Definimos la representación de los objetos tipo Urna:
    @Override
    public String toString(){
        return "Urna(Blancas: " + blancas + ", Negras: " + negras + ")";
    }
}