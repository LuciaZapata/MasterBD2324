package org.uma.mbd.mdTesoro;

import org.uma.mbd.mdRectas.rectas.Punto;
import org.uma.mbd.mdTesoro.tesoro.Tesoro;

public class MainTesoro {
    public static void main(String [] args) {

        // Asignamos las variables de los 6 valores introducidas:
        double p_Ama_x = Integer.parseInt(args[0]);
        double p_Ama_y = Integer.parseInt(args[1]);
        double p_Azul_x = Integer.parseInt(args[2]);
        double p_Azul_y = Integer.parseInt(args[3]);
        double p_Rosa_x = Integer.parseInt(args[4]);
        double p_Rosa_y = Integer.parseInt(args[5]);

        // Creamos los puntos donde se localizan las palmeras:
        Punto p_Ama = new Punto(p_Ama_x, p_Ama_y);
        Punto p_Azul = new Punto(p_Azul_x, p_Azul_y);
        Punto p_Rosa = new Punto(p_Rosa_x, p_Rosa_y);

        // Calculamos y mostramos la posición del tesoro y las estacas:
        Tesoro t =  new Tesoro(p_Ama, p_Azul, p_Rosa);
        System.out.println("El tesoro se encuentra en el punto: " + t.getTesoro());
        System.out.println("La estaca amarilla se encuentra en el punto: " + t.getEstacaAmarilla());
        System.out.println("La estaca azul se encuentra en el punto: " + t.getEstacaAzul());
    }
}
