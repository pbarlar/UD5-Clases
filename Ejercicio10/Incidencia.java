package Ejercicio10;

public class Incidencia {
    int nincidencia;
    static int incpendientes;
    String problema, solucion;
    boolean estado=false;
    
    /*Metodo de clase */
    public Incidencia(int vincidencia , String vproblema){
        nincidencia=vincidencia;
        problema=vproblema;
        incpendientes++;
    }
    
    static int getPendientes(){
        return incpendientes;
    }

    /*Metodos de clase */
    void resuelve(String vresolucion){
        incpendientes--;
        solucion=vresolucion;
        estado=true;
    }

    

    @Override
    public String toString(){
        if (estado==false) {
            return "Puesto: "+nincidencia+" - "+problema+"- Pendiente";
        }else{
            return "Puesto: "+nincidencia+" - "+problema+"- Resuelto - "+solucion;
        }
    }
}
