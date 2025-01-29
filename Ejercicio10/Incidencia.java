package Ejercicio10;

public class Incidencia {
    int npuesto;
    static int incpendientes;
    String problema, solucion;
    boolean estado=false;
    
    /*Metodo de clase */
    public Incidencia(int vpuesto , String vproblema){
        npuesto=vpuesto;
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
            return "Puesto: "+npuesto+" - "+problema+"- Pendiente";
        }else{
            return "Puesto: "+npuesto+" - "+problema+"- Resuelto - "+solucion;
        }
    }
}
