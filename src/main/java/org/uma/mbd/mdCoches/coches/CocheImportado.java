package org.uma.mbd.mdCoches.coches;

// Creamos la clase CocheImportado:
public class CocheImportado extends Coche{

    // Defimos las variables de estado de la clase CocheImportado:
    private double homologacion;

    // Definimos el constructor de la clase CocheImportado:
    public CocheImportado(String nImp, double pImp, double h){
        super(nImp, pImp);
        if (h < 0 )
            throw new IllegalArgumentException("Cuidado, has introducido una homologación negativa.");
        homologacion = h;
    }

    // Definimos la representación de los objetos tipo CocheImportado:
    public double precioTotal(){ return super.precioTotal() + homologacion; }
}
