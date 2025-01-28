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

    void suma(Tiempo t1, Tiempo t2){
        this.segundos=t1.segundos+t2.segundos;
        if (this.segundos>=60) {
            do {
                int temp=this.segundos-60;
                this.minutos=this.minutos+1;
                this.segundos=temp;
            } while (this.segundos>=60);
        }
        this.minutos=t1.minutos+t2.minutos+this.minutos;
        if (this.minutos>=60) {
            do {
                this.minutos=this.minutos-60;
                this.horas=this.horas+1;
               
            } while (this.minutos>=60);
        }
        this.horas=t1.horas+t2.horas+this.horas;
    }


    void resta(Tiempo t1, Tiempo t2){
        this.segundos=t1.segundos-t2.segundos;
        this.minutos=0;
        if (this.segundos<0) {
            do {
                this.segundos=this.segundos+60;
                this.minutos=this.minutos+1;
            } while (this.segundos<0);
        }
        this.minutos=t1.minutos-t2.minutos-this.minutos;
        this.horas=0;
        if (this.minutos<0) {
            do {
                this.minutos=this.minutos+60;
                this.horas=this.horas+1;
            } while (this.minutos<0);
        }
        this.horas=t1.horas-t2.horas-this.horas;
    }
}
