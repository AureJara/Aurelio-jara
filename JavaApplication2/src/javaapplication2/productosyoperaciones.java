package Semana5;

import java.util.Scanner;
import java.util.Random;
class producto {

    //atributos
    private int codigo;
    private String descripcion;
    private int cantidad;
    private double precio_articulo, precio_unitario, pre_total, igv, valor_pago;
    private int prueba = 10;
//pidiendo datos

    public void pedir_datos() {
        Scanner leer = new Scanner(System.in);
        Random cod = new Random();
        System.out.print("inserte descripción del producto");
        descripcion = leer.next();
        codigo = cod.nextInt(1000);
        System.out.println("digite el precio del articulo");
        precio_articulo = leer.nextInt();
        System.out.println("digite la cantidad");
        cantidad = leer.nextInt();
    }

    //metodo precio unitario
    public void preci_uni() {
        precio_unitario = precio_articulo / cantidad;
    }

    //metodo precio total
    public void precio_total() {
        pre_total = cantidad * precio_articulo;
    }

    //el igv
    public void calculo_igv() {
        igv = precio_articulo * 0.18;
    }

    //metodo pago total
    public void pago() {
        valor_pago = igv + pre_total;
    }

    //mostrando resultados
    public void mostrar_resultados() {
        System.out.println("la descripcon del articulo es: " + descripcion);
        System.out.println("el codigo es: " + codigo);
        System.out.println("el precio del articulo es: " + precio_articulo);
        System.out.println("la catindad: " + cantidad);
        System.out.println("el precio unitario es: " + precio_unitario);
        System.out.println("el precio total es: " + pre_total);
        System.out.println("el igv es: " + igv);
        System.out.println("el usuario pagara: " + valor_pago);
    }
}

public class productosyoperaciones {

    //llamando a la clase en funcion principal
    public static void main(String[] args) {
        producto llamar_pro = new producto();
        llamar_pro.pedir_datos();
        llamar_pro.preci_uni();
        llamar_pro.precio_total();
        llamar_pro.calculo_igv();
        llamar_pro.pago();
        llamar_pro.mostrar_resultados();

    }
}
