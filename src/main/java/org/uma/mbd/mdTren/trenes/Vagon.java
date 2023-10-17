package org.uma.mbd.mdTren.trenes;

public class Vagon {

    private int capacidad, carga;

    public Vagon(int cap){
        capacidad = cap;
        carga = 0;
    }

    public int carga(int ton){
        int sobra = 0;
        if (ton > capacidad){
            carga =+ capacidad;
            capacidad = 0;
            sobra = ton - capacidad;
        }
        return sobra;
    }
    public int descarga(int ton){
        int sobra = 0;
        if (ton > carga){
            capacidad =+ carga;
            carga = 0;
            sobra = ton - carga;
        }
        return sobra;
    }
    public int getCarga(){ return carga; }
    public int getCapacidad(){ return capacidad; }

    @Override
    public String toString(){
        return "V(" + carga + "/" + capacidad + ")";
    }
}
