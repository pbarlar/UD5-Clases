package Ejercicio3;

public class Mamifero {
    int longevidad,lactancia, velocidad_maxima;
    
    int obtenerLongevidad(){
        return longevidad;
    }

    int obtenerLactancia(){
        return lactancia;
    }

    int obtenerVelMAx(){
        return velocidad_maxima;
    }

    void establecerLongevidad (int vlong){
        longevidad=vlong;
    }

    void establecerLactancia (int vlact){
        lactancia=vlact;
    }

    void establecerVelMax (int vmax){
        velocidad_maxima=vmax;
    }

    public static void main(String[] args) {
        Mamifero mamifero1=new Mamifero();
        mamifero1.establecerLactancia(3);
        mamifero1.establecerLongevidad(30);
        mamifero1.establecerVelMax(80);
        System.out.println("El mamifero tiene una lactactia tipo "+mamifero1.obtenerLactancia()+" , una velocidad máxima de "+mamifero1.obtenerVelMAx()+" km/h y una logevidad de "+mamifero1.obtenerLongevidad()+" años.");
    }

}
