package Ejercicio4;

public class Autobus {
    String matricula;
    String modelo;
    float potenciaCV;
    int numeroPlazas;

    void setNumeroPlazas (int vnumplazas){
        numeroPlazas=vnumplazas;
    }

    String getMatricula(){
        return matricula;
    }

    String getModelo(){
        return modelo;
    }

    float getPotenciaCV(){
        return potenciaCV;
    }

    int getNumeroPlazas(){
        return numeroPlazas;
    }

}
