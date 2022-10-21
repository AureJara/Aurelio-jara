/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author ACER NITRO 5
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //declaramos el array y las variables
        int prom= 0;
       int [] vc  = {7,7,9,8,1,4};
       int [] vc1 = {7,7,9,8,1,4};
    int aux;
    //alicamos metodo burbuja
    for(int i=0;i<(6-1);i++){
            for(int j=0;j<(6-1);j++){
                if(vc[j]>vc[j+1]){
                    aux=vc[j];
                    vc[j]=vc[j+1];
                    vc[j+1]=aux;
                }
            }
        }
    //muestro mi array
    for(int i = 0 ; i < 6 ; i++ )
    {
        System.out.println(vc[i]);
        
    }
    //sacamos el promedio
    for (int i = 0; i<6 ; i++)
    {
        
        prom = prom + vc[i];
    }
        System.out.println("el promedio es: " + prom/6 ) ;
        // mostramos los pares
        System.out.println("los pares son: ");
    for (int i  = 0 ; i <6 ; i++)
    {
        int aux1;
        aux1= vc[i]%2;
        if(aux1==0)
        {
            System.out.println("  " + vc[i]);
        }
    }
    //realizamos la operacion de x+([x]^7)
        System.out.println("su operacion es: ");
    
    for (int i = 0 ; i <6; i++)
    {
       vc1[i] = vc[i] + ((int)Math . pow(vc[i],7));
        System.out.println("-" + vc1[i]);
    }
}
    
    
}
