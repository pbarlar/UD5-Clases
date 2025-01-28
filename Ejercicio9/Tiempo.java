package Ejercicio9;

public class Tiempo {
    int horas,minutos,segundos;

    /*Metdodos de clase */
    public Tiempo(int vhoras, int vminutos, int vsegundos){
        horas=vhoras;
        minutos=vminutos;
        segundos=vsegundos;
    }
    public Tiempo(int vhoras, int vminutos){
        horas=vhoras;
        minutos=vminutos;
    }
    public Tiempo(int vhoras){
        horas=vhoras;
    }


    /*Metodos de objeto */
    int getHoras(){
        return horas;
    }

    int getMinutos(){
        return minutos;
    }

    int getSegundos(){
        return segundos;
    }

    @Override
    public String toString(){
        return horas+"h "+minutos+"m "+segundos+"s ";
    }

    void suma ()
}
