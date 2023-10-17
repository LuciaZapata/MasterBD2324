package org.uma.mbd.mdJarras.jarras;
import java.util.Objects;

// Creamos la clase Jarra:
public class Jarra {

    // Defimos las variables de estado de la clase Jarra:
    private final int capacidad;
    private int contenido;

    // Definimos el constructor de la clase Jarra:
    public Jarra(int capInicial){
        if (capInicial <= 0)
            throw new IllegalArgumentException("Capacidad negativa o 0.");
        capacidad = capInicial;
        contenido = 0;
    }

    // Definimos los métodos de la clase Jarra:
    public void llena(){
        contenido = capacidad;
    }
    public void vacia(){
        contenido = 0;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public int getContenido(){
        return contenido;
    }
    public void llenaDesde(Jarra j){
        Objects.requireNonNull(j, "La jarra no existe.");
        if (this == j)
            throw new IllegalArgumentException("No se puede volcar una jarra sobre sí misma");
        int cabe = capacidad - contenido;
        if (cabe >= j.contenido){
            contenido += j.contenido;
            j.vacia();
        } else {
            llena();
            j.contenido -= cabe;
        }
    }

    // Definimos la repersentación de los objetos tipo Jarra:
    @Override
    public String toString(){
        return "J(" + capacidad + ", " + contenido + ")";
    }
}
