package org.uma.mbd.mdCoches.coches;

// Creamos la clase Coche:
public class Coche {

    // Defimos las variables de estado de la clase Coche:
    private String nombre;
    private double precio;
    private static double PIVA = 16;

    // Definimos el constructor de la clase Coche:
    public Coche(String n, double p){
        if (p < 0 )
            throw new IllegalArgumentException("Cuidado, has introducido un precio negativo.");
        nombre = n;
        precio = p;
    }

    // Definimos los métodos de la clase Coche:
    public static void setPiva(double IVA){
        if (IVA < 0 )
            throw new IllegalArgumentException("Cuidado, has introducido un IVA negativo.");
        PIVA = IVA;
    }
    public double precioTotal(){ return precio*(1+PIVA/100); }

    // Definimos la representación de los objetos tipo Coche:
    @Override
    public String toString(){ return nombre + " --> " + precioTotal(); }
}
