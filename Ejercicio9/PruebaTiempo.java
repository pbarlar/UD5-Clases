package Ejercicio9;

public class PruebaTiempo {
    public static void main(String[] args) {
        Tiempo t1=new Tiempo(4, 20, 17);
        Tiempo t2=new Tiempo(5, 4, 51);
        Tiempo t3=new Tiempo(0, 0, 0);
        System.out.println(t1);

        t3.suma(t1, t2);
        System.out.println(t3);

        t3.resta(t1, t2);
        System.out.println(t3);

    }
}