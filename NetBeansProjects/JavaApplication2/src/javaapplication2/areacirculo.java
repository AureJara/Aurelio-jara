package javaapplication2;

import java.util.Scanner;

class area_del_circulo_y_atributos {
    //atributos
    private double num_pi = 3.14, producto;
    private int radio;
//metodo pidiendo datos
    public void datos_del_circulo() {
        Scanner digite = new Scanner(System.in);
        System.out.println("digite el radio del circulo");
        radio = digite.nextInt();
        System.out.println("el radio es: " + radio);
    }
//metodo operacion del area
    public void desarrollo() {
        producto = num_pi * (radio * radio);
    }
//metodo mostrar area
    public void mostrar() {
        System.out.println("el area del circulo es: " + producto);

    }
}

public class areacirculo {
    //llamando a la clase en main
    public static void main(String[] args) {
        area_del_circulo_y_atributos area = new area_del_circulo_y_atributos();
        area.datos_del_circulo();
        area.desarrollo();
        area.mostrar();
    }
}
