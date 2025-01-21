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

    String getEstado(){
        return estado;
    }

    void sirve(){
        contadorServidas++;
        if (estado=="pedida") {
            estado="servida";
        }else{
            System.out.println("La pizza ya esta servida.");
        }
    }

}
