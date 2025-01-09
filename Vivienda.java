public class Vivienda{
    int metrosCuadrados, habitaciones;
    String direccion;

    int obtenerHabitaciones(){
        return habitaciones;
    }

    String obtenerDireccion(){
        return direccion;
    }

    int obtenerMetrosCuadrados(){
        return metrosCuadrados;
    }

    void establecerHabitaciones(int vhab){
        habitaciones=vhab;
    }

    void establecerDirección(String vdireccion){
        direccion=vdireccion;
    }

    void establecerMetrosCuadrados(int vmetros){
        metrosCuadrados=vmetros;
    }
    public static void main(String[] args) {
        Vivienda vivienda1=new Vivienda();
        vivienda1.establecerDirección("Calle Maria Jose");
        vivienda1.establecerHabitaciones(5);
        vivienda1.establecerMetrosCuadrados(100);

        System.out.println("Tu vivienda tiene "+vivienda1.obtenerMetrosCuadrados()+" metros cuadrados, tiene "+vivienda1.obtenerHabitaciones()+" habitaciones y se encuentra en "+vivienda1.obtenerDireccion());
    }
}