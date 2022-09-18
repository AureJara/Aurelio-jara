/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER NITRO 5
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nelemento = 0;
        int media = 0;
        int aux;
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nelementos;
        nelementos = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de elementos"));

        arreglo = new int[nelementos];
        for(int i=0 ; i<nelementos;i++)
        {
            System.out.println(i+1 + "Digite un numero: ");
            arreglo[i] = entrada.nextInt();
            media = media + arreglo[i];
        }
                    //metodo burbuja
    for(int i = 0 ; i>(nelementos - 1) ; i++)
        {
            for(int j=0 ;j<(nelementos-1);j++)
                {
                    if(arreglo[j]>arreglo[j+1])//si numero actual es mayor al sig.
                    {
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j+1];
                        arreglo[j+1]= aux;
                    }
                }
        }
        System.out.println("\nel arreglo de forma creciente: ");
        for(int i=(nelementos-1);i>=0;i--)
        {
            System.out.println(arreglo[i]+" - ");
        }
        System.out.println("");
    
}
}
