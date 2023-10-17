package org.uma.mbd.mdLibreriaV2L.libreria;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LibreriaEnOferta extends Libreria{

    private double descuento;
    private String [] autoresEnOferta;

    public LibreriaEnOferta(double d, String [] aeo){
        // No hace falta poner el super() porque si no ponemos nada, llama solo al super()
        setOferta(d, aeo);
    }

    public void setOferta(double d, String [] aeo){
        descuento = d;
        autoresEnOferta = aeo;
    }

    public String[] getOferta() {
        return autoresEnOferta;
    }

    public void addLibro(String autor, String titulo, double precioBase){
        boolean aeo = esAutorEnOferta(autor);
        Libro libro;
        if (aeo)
            libro = new LibroEnOferta(autor, titulo, precioBase, descuento);
        else
            libro = new Libro(autor, titulo, precioBase);
        addLibro(libro);
    }

    private boolean esAutorEnOferta(String autor){
        int pos = 0;
        while (pos < autoresEnOferta.length && !autoresEnOferta[pos].equalsIgnoreCase(autor))
            pos++;
        return pos < autoresEnOferta.length;
    }

    @Override
    public String toString(){
        return descuento + "%" + Arrays.toString(autoresEnOferta) + super.toString();
    }
}
