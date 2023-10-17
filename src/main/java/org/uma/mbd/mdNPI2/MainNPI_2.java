package org.uma.mbd.mdNPI2;

import org.uma.mbd.mdNPI2.npi.NPI;

public class MainNPI_2 {
    public static void main(String[] args) {

        // Creamos un objeto tipo NPI:
        var Cal_2 = new NPI();

        // // Llamamos a los métodos para calcular en Polaca Inversa la expresión 3 6 2 - * 2 7 + 5 / +
        Cal_2.entra(3);
        Cal_2.entra(6);
        Cal_2.entra(2);
        Cal_2.opera2((x,y) -> x-y);
        Cal_2.opera2((x,y) -> x*y);
        Cal_2.entra(2);
        Cal_2.entra(7);
        Cal_2.opera2((x,y) -> x+y);
        Cal_2.entra(5);
        Cal_2.opera2((x,y) -> x/y);
        Cal_2.opera2((x,y) -> x+y);

        // Mostramos el resultado del cálculo:
        System.out.println("Resultado_2 = " + Cal_2.getResultado());
    }
}