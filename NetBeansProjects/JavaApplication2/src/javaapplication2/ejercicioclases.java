package javaapplication2;
import java.util.Scanner;
public class ejercicioclases {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int num;
        int producto = 1;
        System.out.println("ingrese un numero para su factorial");
        num = numero.nextInt();
        while (num > 1) {
            producto = num * producto;
            num = num - 1;
        }
        System.out.println("el resultado del factorial es: " + producto);
    }
}