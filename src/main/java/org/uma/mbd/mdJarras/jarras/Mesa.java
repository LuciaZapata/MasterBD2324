package org.uma.mbd.mdJarras.jarras;

// Creamos la clase Mesa:
public class Mesa {

    // Defimos las variables de estado de la clase Mesa:
    private Jarra jarraA, jarraB;

    // Definimos el constructor de la clase Mesa:
    public Mesa(int capInicialJarraA, int capInicialJarraB){
        jarraA = new Jarra(capInicialJarraA);
        jarraB = new Jarra(capInicialJarraB);
    }

    // Definimos los métodos de la clase Mesa:
    public void llenaA(){ jarraA.llena(); }
    public void llenaB(){
        jarraB.llena();
    }
    public void vaciaA(){ jarraA.vacia(); }
    public void vaciaB(){ jarraB.vacia(); }
    public void vuelcaASobreB(){ jarraB.llenaDesde(jarraA); }
    public void vuelcaBSobreA(){ jarraA.llenaDesde(jarraB); }
    public int getContenidoA(){ return jarraA.getContenido(); }
    public int getContenidoB(){ return jarraB.getContenido(); }
    public int getCapacidadA(){ return jarraA.getCapacidad(); }
    public int getCapacidadB(){ return jarraB.getCapacidad(); }
    public int getContenido(){
        return jarraA.getContenido() + jarraB.getContenido();
    }

    // Definimos la repersentación de los objetos tipo Mesa:
    @Override
    public String toString(){
        return "M(" + jarraA + ", " + jarraB + ")";
    }
}
