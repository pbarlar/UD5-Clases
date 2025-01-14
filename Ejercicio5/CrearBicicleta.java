package Ejercicio5;

class CrearBicicleta {
    public static void main(String[] args) {
        Bicicleta miBicicleta=new Bicicleta();
        miBicicleta.setMarcha(4);
        System.out.println("El coche esta en "+miBicicleta.getMarcha()+" marcha");
        miBicicleta.Avanzar(50);
        miBicicleta.Frenar(20);  
    }
    
}