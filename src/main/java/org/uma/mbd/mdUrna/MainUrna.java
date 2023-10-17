package org.uma.mbd.mdUrna;
import org.uma.mbd.mdUrna.urna.Urna;

public class MainUrna {
    public static void main(String[] args) {

        try {
            // La primera variable que introduzco es b y la segunda n:
            int b = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);

            // Creamos un objeto tipo Urna, compuesta por el número inicial de bolas blancas y negras:
            var U = new Urna(b, n);
            System.out.println("La configuración inicial de la urna es: " + U);

            // Implementamos la lógica del ejercicio:
            while (U.totalBolas() > 1) {
                Urna.ColorBola ColorBola1 = U.extraerBola();
                Urna.ColorBola ColorBola2 = U.extraerBola();
                if (ColorBola1.equals(ColorBola2)) {
                    U.ponerBlanca();
                } else {
                    U.ponerNegra();
                }
            }

            // Mostramos el color de la última bola y el análisis realizado:
            if (U.totalBolas() == 1) {
                System.out.println("La última bola es " + U.extraerBola() + ".");
                System.out.println("Esto ocurre porque el número inicial de bolas negras es " + U.ParImpar + "." +
                        " \nLa conclusión es que si el número de bolas negras iniciales es par, la última bola será " +
                        "blanca, y si es impar, será negra. \nPrueba otros valores iniciales para comprobarlo :)");
            }

        }

        // Control de excepciones:
        catch(ArrayIndexOutOfBoundsException e){
          System.err.println("No has introducido dos argumentos.");
        }catch (NumberFormatException e) {
          System.err.println("No has introducido dos números enteros." + e.getMessage());
        }
    }
}
