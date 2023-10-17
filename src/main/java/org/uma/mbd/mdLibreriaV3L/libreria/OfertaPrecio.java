package org.uma.mbd.mdLibreriaV3L.libreria;

import org.uma.mbd.mdLibreriaV3L.libreria.Libro;
import org.uma.mbd.mdLibreriaV3L.libreria.OfertaFlex;

public class OfertaPrecio implements OfertaFlex {

    private double descuento, umbral;

    public OfertaPrecio(double pd, double umb){
        descuento = pd;
        umbral = umb;
    }

    @Override
    public double getDescuento(Libro libro){
        double des = 0;
        if (libro.getPrecioBase() >= umbral)
            des = descuento;
        return des;
    }

    @Override
    public String toString(){
        return descuento + "%(" + umbral + ")";
    }
}
