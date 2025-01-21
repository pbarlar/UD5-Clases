package Ejercicio6;

public class Fraccion {
   
   /*Atributos objeto  */
    int denominador,numerador;
    

    /*Metodos de objeto */

    void setFraccion(int vnumerador,int vdenominador){
        denominador=vdenominador;
        numerador=vnumerador;
    }

    void Invertir(){
        int denominadorNuevo=numerador;
        numerador=denominador;
        denominador=denominadorNuevo;
    }


    int getNumerador(){
        return numerador;
    }

    int getDenominador(){
        return denominador;
    }


    /*
    void Multiplicar(int n1,int d1,int n2,int d2){
        int numfinal=n1*n2;
        int denfinal=d1*d2;
        System.out.println(" La fraccion multiplicada es "+numfinal+"/"+denfinal);
        
    }
    */

    static Fraccion Multiplicar(Fraccion f1, Fraccion f2){
        Fraccion f3=new Fraccion();
        f3.setFraccion(f1.getNumerador()*f2.getNumerador(), f1.getDenominador()*f2.getDenominador());
        return (f3);
    }

    static Fraccion Dividir(Fraccion f1, Fraccion f2){
        Fraccion f3=new Fraccion();
        f3.setFraccion(f1.getNumerador()*f2.getDenominador(),f1.getDenominador()*f2.getNumerador());
        return (f3);
    }

    static Fraccion Simplificar(Fraccion f1){
        int divisor,numerador,resto;
        Fraccion f4=new Fraccion();
        if (f1.getNumerador()>f1.getDenominador()) {
            numerador=f1.getNumerador();
            divisor=f1.getDenominador();
        }else{
            numerador=f1.getDenominador();
            divisor=f1.getNumerador();
        }

       while (numerador%divisor!=0) {
            if (numerador%divisor!=0) {
                int temp=numerador;
                numerador=divisor;
                divisor=temp%divisor;
            }else{
                f4.setFraccion(numerador, divisor);
                break;
            }
        }
        return f4;
    }






    public static void main(String[] args) {
        Fraccion f1=new Fraccion();
        Fraccion f2=new Fraccion();
        Fraccion f3=new Fraccion();
        f1.setFraccion(3, 5);
        f2.setFraccion(8, 4);
        
        f1.Invertir();
        System.out.println(f1.getNumerador()+"/"+f1.getDenominador());
        f3=Fraccion.Multiplicar(f1, f2);
        System.out.println("La multiplicación final es "+f3.getNumerador()+"/"+f3.getDenominador());
        f3=Fraccion.Dividir(f1, f2);
        System.out.println("La division final es "+f3.getNumerador()+"/"+f3.getDenominador());
        f3=Fraccion.Simplificar(f2);
        System.out.println("La fracción simplificada es "+f3.getNumerador()+"/"+f3.getDenominador());
        
    }
}
