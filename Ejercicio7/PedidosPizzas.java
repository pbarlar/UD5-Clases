package Ejercicio7;

class PedidosPizzas {
    public static void main(String[] args) {
        Pizza p1= new Pizza("margarita","mediana");
        Pizza p2= new Pizza("funghi","familiar");
        p2.sirve();
        Pizza p3= new Pizza("cuatro quesos","mediana");
        System.out.println("pizza "+p1.getTipoPizza()+" "+p1.getTamañoPizza()+", "+p1.getEstado());
        System.out.println("pizza "+p2.getTipoPizza()+" "+p2.getTamañoPizza()+", "+p2.getEstado());
        System.out.println("pizza "+p3.getTipoPizza()+" "+p3.getTamañoPizza()+", "+p3.getEstado());
        p2.sirve();
        System.out.println("Pedidas: "+Pizza.getTotalPedidas());
        System.out.println("Servidas: "+Pizza.getTotalServidas());
    }
    
}