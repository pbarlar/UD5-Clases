package Ejercicio5;

public class Bicicleta {
    
    /*Atibutos de clase */
    public static final String color="Negro";
    
    /*Atributos de objeto */
    public int velocidad;
    
    public int marcha;

    int getMarcha(){
        return marcha;
    }

    void setAvanzar(int velocidad, int minutos){
        float minutos2=minutos/60f;
        double metrosAvanzados=velocidad*minutos2;
        System.out.println("Has recorrido "+metrosAvanzados+" metros en "+minutos+" minutos.");
    }


}
