package org.uma.mbd.mdNPI2.npi;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;

public class NPI {

    // Defimos las variables de estado de la clase NPI:
    private double x, y, z, t;

    // Definimos el constructor de la clase NPI:
    public NPI(){
        x = y = z = t = 0;
    }

    // Definimos los métodos de la clase Jarra:
    public void entra(double valor){
        t = z;
        z = y;
        y = x;
        x = valor;
    }
    public void opera1(DoubleUnaryOperator opera){
        x = opera.applyAsDouble(x);
    }
    public void opera2(DoubleBinaryOperator opera){
        x = opera.applyAsDouble(y, x);
        y = z;
        z = t;
    }

    public double getResultado(){ return x; }

    // Definimos la repersentación de los objetos tipo NPI:
    @Override
    public String toString(){return "NPI(x=" + x + ", y=" + y + ", z=" + z + ", t=" + t + ")";}

}