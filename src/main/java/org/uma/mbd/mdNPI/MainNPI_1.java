package org.uma.mbd.mdNPI;
import org.uma.mbd.mdNPI.npi.NPI;

public class MainNPI_1 {
    public static void main(String[] args) {

        // Creamos un objeto tipo NPI:
        var Cal_1 = new NPI();

        // Llamamos a los métodos para calcular en Polaca Inversa la expresión 3 6 2 - * 5 +
        Cal_1.entra(3);
        Cal_1.entra(6);
        Cal_1.entra(2);
        Cal_1.resta();
        Cal_1.multiplica();
        Cal_1.entra(5);
        Cal_1.suma();

        // Mostramos el resultado del cálculo:
        System.out.println("Resultado_1 = " + Cal_1.getResultado());
    }
}