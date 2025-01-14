package Ejercicio5;

public class Bicicleta {
    
    public String color="Negro";
    public int velocidad;
    
    public int marcha;

    int getMarcha(){
        return marcha;
    }

    int getVelocidad(){
        return velocidad;
    }
    
    void setMarcha(int vMarcha){
        marcha=vMarcha;
    }

    void Avanzar(int avanza){
        velocidad=avanza;
        System.out.println("La bicicleta esta avanzando a "+velocidad+" por hora.");
    }

    void Frenar(int frena){
        velocidad=frena;
        System.out.println("La bicicleta esta frenando y va a "+velocidad+" por hora.");
    }

  


}
