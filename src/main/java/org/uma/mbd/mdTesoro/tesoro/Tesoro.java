package org.uma.mbd.mdTesoro.tesoro;

import org.uma.mbd.mdRectas.rectas.Punto;
import org.uma.mbd.mdRectas.rectas.Vector;

// Creamos la clase Tesoro:
public class Tesoro {

    // Defimos las variables de estado de la clase Tesoro:
    private Punto p_Amarilla, p_Azul, p_Rosa, e_Azul, e_Amarilla, tesoro;

    // Definimos el constructor de la clase Tesoro:
    public Tesoro(Punto pAmarilla, Punto pAzul, Punto pRosa){
        p_Amarilla = pAmarilla;
        p_Azul = pAzul;
        p_Rosa = pRosa;
        calculaPosiciones();
    }

    // Definimos los métodos de la clase Tesoro:
    private void calculaPosiciones(){
        Vector v_pRosa_pAma = new Vector(p_Rosa, p_Amarilla);
        Vector v_eAma = v_pRosa_pAma.ortogonal();
        e_Amarilla =  v_eAma.extremoDesde(p_Amarilla);

        Vector v_pRosa_pAzul = new Vector(p_Rosa, p_Azul);
        Vector v_eAzul = v_pRosa_pAzul.ortogonal().ortogonal().ortogonal();
        e_Azul = v_eAzul.extremoDesde(p_Azul);

        Vector v_eAma_eAzul = new Vector(e_Amarilla, e_Azul);

        Vector v_tesoro = new Vector(new Punto(v_eAma_eAzul.getComponenteX()/2,v_eAma_eAzul.getComponenteY()/2));
        tesoro = v_tesoro.extremoDesde(e_Amarilla);
    }
    public Punto getEstacaAmarilla(){ return e_Amarilla; }
    public Punto getEstacaAzul(){ return e_Azul; }
    public Punto getTesoro(){ return tesoro; }

    // Definimos la representación de los objetos tipo Tesoro:
    @Override
    public String toString(){
        return "T(" + tesoro + ")";
    }
}
