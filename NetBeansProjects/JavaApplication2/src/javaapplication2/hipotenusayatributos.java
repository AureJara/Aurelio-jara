package javaapplication2;
import java.util.Scanner;
class hipotenusa {
    
    //estos son los atribuutos para hallar la hipotenusa en pitagoras en private
    private int cateto_opuesto;
    private int cateto_adyacente;
    private double suma, raiz;
    private int producto_opuesto;
    private int producto_adyacente;
    
    //estos son los metodos de la operacion, son void para que no devuelvan valor
    
    public void pidiendo_datos() {      //metodo de pedir datos
        Scanner leer = new Scanner(System.in);
        System.out.println("digite el cateto opuesto");
        cateto_opuesto = leer.nextInt();
        System.out.println("digite el cateto adycente");
        cateto_adyacente = leer.nextInt();
    }
    public void operacion_pitagoras() {       //metodo de la operacion
        producto_opuesto = cateto_opuesto * cateto_opuesto;
        producto_adyacente = cateto_adyacente * cateto_adyacente;
        suma = producto_opuesto + producto_adyacente;
        raiz = Math.sqrt(suma);
    }
    public void resultado_pitagoras() {     //metodo para mostrar
        System.out.println("la hipotenusa por pitagoras es: " + raiz);
    }
}
public class hipotenusayatributos {
    public static void main(String[] args) {   //llamada a los metodos desde la funcion principal
        hipotenusa hipo = new hipotenusa();
        hipo.pidiendo_datos();
        hipo.operacion_pitagoras();
        hipo.resultado_pitagoras();
    }
}