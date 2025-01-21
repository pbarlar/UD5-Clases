package Ejercicio7;

import javax.print.DocFlavor.STRING;

public class Pizza {
    String tipo,tamaño, estado;
    static int contadorPizzas;
    static int contadorServidas;
    
    /*Metodos clase */
    public Pizza (String tipoPizza, String tamañoPizza){
        contadorPizzas++;
        tipo=tipoPizza;
        tamaño=tamañoPizza;
        estado="pedida";
    }
    
    static int getTotalPedidas(){
        return contadorPizzas;
    }

    static int getTotalServidas(){
        return contadorServidas;
    }

    /*Metodos objeto */
    String getTamañoPizza(){
        return tamaño;
    }

    String getTipoPizza(){
        return tipo;
    }

    static void sirve(){
        contadorServidas++;
        estado="servida";
    }

    void sirve(){
        
    }
}
