package Ejercicio2;

public class Jugadores {
    String nombrejugador,equipo;
    int edad;

    String obtenerNombreJugador(){
        return nombrejugador;
    }

    String obtenerEquipo(){
        return equipo;
    }

    int obtenerEdad(){
        return edad;
    }

    void establecerNombre(String nombrej){
        nombrejugador=nombrej;
    }

    void establecerEquipo(String vequipo){
        equipo=vequipo;
    }

    void establecerEdad(int vedad){
        edad=vedad;
    }

    public static void main(String[] args) {
        Jugadores jugador1=new Jugadores();
        jugador1.establecerEdad(25);
        jugador1.establecerEquipo("Granada CF");
        jugador1.establecerNombre("Carlos Neva");
        System.out.println("El jugador "+jugador1.obtenerNombreJugador()+" de "+jugador1.obtenerEdad()+" años juega en el "+jugador1.obtenerEquipo());
    }

}
