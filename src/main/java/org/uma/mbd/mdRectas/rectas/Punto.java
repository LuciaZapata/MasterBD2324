package org.uma.mbd.mdRectas.rectas;

// Creamos la clase Punto:
public class Punto {

    // Defimos las variables de estado de la clase Punto:
    private double x, y;

    // Definimos los constructores de la clase Punto:
    public Punto() { x = y = 0; }
    public Punto(double a, double b) { x = a; y = b; }

    // Definimos los métodos de la clase Punto:
    public double abscisa() { return x; }
    public double ordenada() { return y; }
    public void abscisa(double a){ x = a; }
    public void ordenada(double b){ y = b; }
    public void trasladar(double a, double b) {
        x += a; y += b;
    }
    public double distancia(Punto pto) {
        return Math.sqrt(Math.pow(x - pto.x, 2) + Math.pow(y - pto.y, 2));
    }

    // Definimos la representación de los objetos tipo Punto:
    @Override
    public String toString(){
        return "P(" + x + ", " + y + ")";
    }
}
