package org.uma.mbd.mdRectas.rectas;

// Creamos la clase Vector:
public class Vector {

    // Defimos las variables de estado de la clase Vector:
    private Punto extremo;

    // Definimos los constructores de la clase Vector:
    public Vector(Punto pto) { extremo = pto; }
    public Vector(Punto pto1, Punto pto2) {
        double a = pto2.abscisa() - pto1.abscisa();
        double b = pto2.ordenada() - pto1.ordenada();
        extremo = new Punto(a,b);
    }
    public Vector(double a, double b) { extremo =  new Punto(a,b); }

    // Definimos los métodos de la clase Vector:
    public Punto extremoDesde(Punto org){
        extremo.trasladar(org.abscisa(), org.ordenada());
        return extremo;
    }
    public double getComponenteX(){ return extremo.abscisa(); }
    public double getComponenteY(){ return extremo.ordenada(); }
    public double modulo(){
        return extremo.distancia(new Punto());
    }
    public Vector ortogonal(){
        return new Vector(-extremo.ordenada(), extremo.abscisa());
    }
    public boolean paraleloA(Vector v){
        return v.extremo.ordenada() * extremo.ordenada() == v.extremo.abscisa() * extremo.abscisa();
    }

    // Definimos la representación de los objetos tipo Vector:
    @Override
    public String toString(){
        return "V(" + getComponenteX() + ", " + getComponenteY() + ")";
    }
}
