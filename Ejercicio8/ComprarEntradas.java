package Ejercicio8;

import java.util.Scanner;

public class ComprarEntradas {
    
    public static void main(String[] args) {
        Zona z1=new Zona(1225);
        Scanner entrada=new Scanner(System.in);
        int opcion=0,i=0;

        for (i = 0; i == 3;) {
            System.out.println("1. Mostrar numero de entradas libres.");
            System.out.println("2. Vender entradas.");
            System.out.println("3. Salir.");
            System.out.print("Eliga una opción: ");
            opcion=entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Quedan "+z1.getEntradasPorVender()+" entradas por vender ");
                    break;
                case 2:
                    z1.vender(30);
                    break;
                case 3:
                    i=3;
                    break;
            }
        }
    }
    

}
