package org.uma.mbd.mdRectas.rectas;

// Creamos la clase Recta:
public class Recta {

    // Defimos las variables de estado de la clase Recta:
    private Vector direccion;
    private Punto pto;

    // Definimos los constructores de la clase Recta:
    public Recta(Vector v, Punto p){
        direccion = v;
        pto = p;
    }
    public Recta(Punto p1, Punto p2){
        direccion = new Vector(p1, p2);
        pto = p1;
    }

    // Definimos los métodos de la clase Recta:
    public boolean paralelaA(Recta r){
        return direccion.paraleloA(r.direccion);
    }
    public Recta paralelaPor(Punto p){
        return new Recta(direccion, p);
    }
    public Boolean pasaPor(Punto p){
        return direccion.paraleloA(new Vector(p, pto));
    }
    public Recta perpendicularPor(Punto p){
        return new Recta(direccion.ortogonal(), p);
    }
    public double distanciaDesde(Punto p){
        Recta r = perpendicularPor(p);
        Punto q = interseccionCon(r);
        return p.distancia(q);
    }
    public Punto interseccionCon(Recta r){
        if (paralelaA(r)) {
            throw new RuntimeException("Las rectas son paralelas.");
        }
        double a = implicita().a;
        double b = implicita().b;
        double c = implicita().c;
        double aprima = r.implicita().a;
        double bprima = r.implicita().b;
        double cprima = r.implicita().c;
        double denominador = determinante(a, b, aprima, bprima);
        double x = determinante(-c, b, -cprima, bprima)/denominador;
        double y = determinante(a, -c, aprima, -cprima)/denominador;
        return new Punto(x, y);
    }
    public Implicita implicita(){
        return new Implicita(1/direccion.getComponenteX(), -1/direccion.getComponenteY(),
                pto.ordenada()/direccion.getComponenteY()-pto.abscisa()/direccion.getComponenteX());
    }

    public double determinante(double a11, double a12, double a21, double a22){
        return a11*a22-a12*a21;
    }

    // Definimos la representación de los objetos tipo Recta:
    @Override
    public String toString(){
        return "R(" + direccion + ", " + pto + ")";
    }
}
