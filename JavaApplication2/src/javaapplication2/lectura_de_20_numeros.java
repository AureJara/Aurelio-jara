package javaapplication2;
import java.util.Random;
public class lectura_de_20_numeros {
    public static void main(String[] args) {
        int suma = 0;
        int numero;
        int contador = 0;
        int media;
        int numero_mayor = 0;
        int numero_menor = 0;
        boolean op;
        Random num = new Random();
        do {
            contador++;
            numero = num.nextInt(100);
            System.out.println("los numeros son: " + numero);
            if (contador == 1) {
                numero_menor = numero;
            } else {
                if (numero < numero_menor) {
                    numero_menor = numero;
                }
            }
            suma = numero + suma;
        } while (contador < 20);
        media = suma / 20;
        System.out.println("la media es: " + media);
        System.out.println("el menor de todos es: " + numero_menor);
    }
}