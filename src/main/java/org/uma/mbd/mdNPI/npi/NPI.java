package org.uma.mbd.mdNPI.npi;

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
    public void suma(){
        x = y + x;
        y = z;
        z = t;
    }
    public void resta(){
        x = y - x;
        y = z;
        z = t;
    }
    public void multiplica(){
        x = y * x;
        y = z;
        z = t;
    }
    public void divide(){
        if (x == 0)
            throw new ArithmeticException("Cuidado, estás intentando dividir por 0.");
        x = y / x;
        y = z;
        z = t;
    }
    public double getResultado(){ return x; }

    // Definimos la repersentación de los objetos tipo NPI:
    @Override
    public String toString(){return "NPI(x=" + x + ", y=" + y + ", z=" + z + ", t=" + t + ")";}

}