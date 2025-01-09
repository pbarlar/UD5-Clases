package Ejercicio4;

public class CrearAutobus {
    public static void main(String[] args) {
        Autobus autobus1=new Autobus();
        int numeroPlazas=100;
        autobus1.setNumeroPlazas(numeroPlazas);
        System.err.printf("El autobus tiene %d numero de plazas",autobus1.getNumeroPlazas());
    }
}
