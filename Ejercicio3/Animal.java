package Ejercicio3;

public class Animal {
   String nombre,especie;
   int edad;

   String obtenerNombre(){
    return nombre;
   }

   String obtenerEspecie(){
    return especie;
   }

   int obtenerEdad(){
    return edad; 
   }

   void establecerNombre(String vnombre){
    nombre=vnombre;
   }

   void establecerEspecie(String vespecie){
    especie=vespecie;
   }

   void establecerEdad(int vedad){
    edad=vedad;
   }

   public static void main(String[] args) {
    Animal animal1=new Animal();
    animal1.establecerEdad(17);
    animal1.establecerEspecie("Panthera leo");
    animal1.establecerNombre("Leon");
    System.out.println("El animal es el "+animal1.obtenerNombre()+", de especie "+animal1.obtenerEspecie()+" y de "+animal1.obtenerEdad());
   }
   
}
