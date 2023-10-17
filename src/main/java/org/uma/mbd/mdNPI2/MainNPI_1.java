package org.uma.mbd.mdNPI2;

import org.uma.mbd.mdNPI2.npi.NPI;

public class MainNPI_1 {
    public static void main(String[] args) {

        // Creamos un objeto tipo NPI:
        var Cal_1 = new NPI();

        // Llamamos a los métodos para calcular en Polaca Inversa la expresión 3 6 2 - * 5 +
        Cal_1.entra(3);
        Cal_1.entra(6);
        Cal_1.entra(2);
        Cal_1.opera2((x,y) -> x-y);
        Cal_1.opera2((x,y) -> x*y);
        Cal_1.entra(5);
        Cal_1.opera2((x,y) -> x+y);

        Cal_1.opera1(x -> Math.sqrt(x));
        Cal_1.opera2((x,y) -> Math.sin(x)+y);

        // Mostramos el resultado del cálculo:
        System.out.println("Resultado_1 = " + Cal_1.getResultado());
    }
}