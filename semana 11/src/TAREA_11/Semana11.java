import java.util.Scanner;



public class Semana11 {
     
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        int base = teclado.nextInt();
        System.out.print("Introduce el exponente: ");
        int exponente = teclado.nextInt();
        teclado.close();
        System.out.printf("%n%d elevado a %d es igual a %.3f", base, exponente, potencia(base, exponente));
    }
         
    private static double potencia(int base, int exponente){
        if(exponente==0){
            return 1;
        } else if (exponente<0) {
            return potencia(base, exponente+1) / base;
        } else {
            return base * potencia(base, exponente-1);
        }
    }
}
