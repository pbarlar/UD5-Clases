package Ejercicio8;

import java.util.Scanner;

public class ComprarEntradas {
    
    public static void main(String[] args) {
        Zona principal=new Zona(1000);
        Zona compra_venta=new Zona(200);
        Zona vip=new Zona(25);
        Scanner entrada=new Scanner(System.in);
        int opcion=0, comprar=0, zona=0;

        while (opcion!=3) {
            System.out.println("1. Mostrar numero de entradas libres.");
            System.out.println("2. Vender entradas.");
            System.out.println("3. Salir.");
            System.out.print("Eliga una opción: ");
            opcion=entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Quedan "+(principal.getEntradasPorVender()+compra_venta.getEntradasPorVender()+vip.getEntradasPorVender())+" entradas por vender ");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("De que zona quieres comprar: ");
                    System.out.println("1. Zona principal.");
                    System.out.println("2. Zona compra-venta.");
                    System.out.println("3. Zona vip");
                    System.out.println("Eliga una opción: ");
                    zona=entrada.nextInt();
                    System.out.println("Cuantas entradas quieres comprar: ");
                    comprar=entrada.nextInt();
                    if (opcion==1){
                        principal.vender(comprar);
                    } else if (opcion==2){
                        compra_venta.vender(comprar);
                    }else if (opcion==3){
                        vip.vender(comprar);
                    }
                    break;
            }
        }
    }
    

}
