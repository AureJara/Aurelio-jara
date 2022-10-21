package Semana5;

import java.util.Random;
//forma de crear un vector
//int[]numeros={5,7,9};



public class vector_de_10_antes_y_despues {

    public static void main(String[] args) {
        int numero_ayuda;
        //vector de tamaño 10
        int[] numeros_uso = new int[10];
        Random rad = new Random();
        for (int i = 0; i < numeros_uso.length; i++) {
            numeros_uso[i] = rad.nextInt(100);
        }
        System.out.print("estos son los numeros originales :  ");
        for (int i = 0; i < numeros_uso.length; i++) {
            System.out.print(numeros_uso[i] + " - ");
        }
        //el metodo burbuja
        for (int i = 0; i < (numeros_uso.length - 1); i++) {
            for (int j = 0; j < (numeros_uso.length - 1); j++) {
                if (numeros_uso[j] < numeros_uso[j + 1]) {
                    numero_ayuda = numeros_uso[j];
                    numeros_uso[j] = numeros_uso[j + 1];
                    numeros_uso[j + 1] = numero_ayuda;
                }
            }
        }
        System.out.println("");
        System.out.print("los numeros ordenados son: ");
        for (int i = 0; i < numeros_uso.length; i++) {
            System.out.print(numeros_uso[i] + " - ");

        }
        System.out.println("");
    }
}
