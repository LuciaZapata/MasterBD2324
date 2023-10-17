package org.uma.mbd.mdLibreriaV3L.libreria;

public class Libro {

    private String autor, titulo;
    private double precioBase, descuento;
    private static double IVA = 10;

    public Libro(String au, String ti, double pb){
        autor = au;
        titulo = ti;
        precioBase = pb;
    }

    public String getAutor(){ return autor; }
    public String getTitulo(){ return titulo; }
    public double getPrecioBase(){ return precioBase; }
    public static double getIVA(){ return IVA; }
    public static void setIVA(double IVA){ Libro.IVA = IVA; }
    public double getPrecioFinal(){ return precioBase + precioBase*Libro.IVA/100; }

    @Override
    public String toString(){
        return "(" + autor + ", " + titulo + ", " + precioBase + ", " + Libro.IVA + "%, " + this.getPrecioFinal() + ")";
    }

}
