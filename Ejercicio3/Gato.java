package Ejercicio3;

public class Gato {
    int edad, peso;
    String nombre;

    int getEdad (){
        return edad;
    }

    int getPeso(){
        return peso;
    }

    String getNombre(){
        return nombre;
    }

    void setEdad(int vedad){
        edad=vedad;
    }

    void setPeso (int vpeso){
        peso=vpeso;
    }

    void setNombre (String vnombre){
        nombre=vnombre;
    }

    public static void main(String[] args) {
        Gato gato1=new Gato();
        gato1.setEdad(5);
        gato1.setNombre("Luna");
        gato1.setPeso(13);
        System.out.println("El gato se llama "+gato1.getNombre()+" pesa "+gato1.getPeso()+" kilos y tiene "+gato1.getEdad()+" años.");

    }
}
