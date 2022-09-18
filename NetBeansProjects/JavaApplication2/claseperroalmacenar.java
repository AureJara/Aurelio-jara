package Semana5;

import java.util.Scanner;
import java.util.Random;

class perro {

    private String[] name = new String[10];
    private int aleatorio;
    private String[] sexo = new String[10];

    public void pedir_y_mostrar() {
        Random ale = new Random();
        System.out.println("digite los nombres");
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < name.length; i++) {
            name[i] = leer.next();
        }
        System.out.println("este es el primer orden: ");
        for (int i = 0; i < name.length; i++) {
            System.out.print("\n - ");
            System.out.println(name[i]);

        }
        System.out.println("se muestra orden aleatorio: ");
        for (int i = 0; i < name.length - 1; i++) {
            System.out.print("\n - ");
            aleatorio = ale.nextInt(10);
            System.out.println(name[aleatorio]);

        }
    }
}

public class claseperroalmacenar {

    public static void main(String[] args) {
        perro llamada_info = new perro();
        perro vector_pe[]=new perro[10];
        llamada_info.pedir_y_mostrar();
    }
}
