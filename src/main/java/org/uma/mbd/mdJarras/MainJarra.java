package org.uma.mbd.mdJarras;
import org.uma.mbd.mdJarras.jarras.Mesa;

public class MainJarra {
    public static void main(String[] args) {

        // Le digo que la primera variable que le digo es c1 y la segunda c2
        int c1 = Integer.parseInt(args[0]);
        int c2 = Integer.parseInt(args[1]);

        // Creamos un objeto tipo Mesa, compuesto por dos jarras de capacidades 7 y 5 L:
        var M = new Mesa(c1, c2);

        // Llamamos a los métodos necesarios para conseguir que haya 1L en una de las dos jarras:
        M.llenaB();
        M.vuelcaBSobreA();
        M.llenaB();
        M.vuelcaBSobreA();
        M.vaciaA();
        M.vuelcaBSobreA();
        M.llenaB();
        M.vuelcaBSobreA();

        // Mostramos el estado del objeto M:
        System.out.println("Mesa = " + M);
    }
}
