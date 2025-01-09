package Ejercicio3;

public class Ave {
    String raza;
    int num_crias;
    String habitat;

    String obtenerRaza(){
        return raza;
    }

    int obtenerNumCrias(){
        return num_crias;
    }

    String obtenerHabitat(){
        return habitat;
    }

    void establecerRaza(String vraza){
        raza=vraza;
    }

    void establecerNumCrias(int vnumcrias){
        num_crias=vnumcrias;
    }

    void establecerHabitat(String vhabitat){
        habitat=vhabitat;
    }

    public static void main(String[] args) {
        Ave ave1=new Ave();
        ave1.establecerHabitat("África");
        ave1.establecerNumCrias(3);
        ave1.establecerRaza("Canario");
        System.out.println("Este ave es un "+ave1.obtenerRaza()+", tiene "+ave1.obtenerNumCrias()+" crias y se encuentra en "+ave1.obtenerHabitat());
    }
}
