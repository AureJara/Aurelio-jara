/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg6;

import java.util.Random;

/**
 *
 * @author ACER NITRO 5
 */
public class NewClass {
    int tam = 0;
        
        int[] numeros = new int[tam];                                                                             
        Random rnd = new Random();
        
        for (int i = 0; i < numeros.length; i++) {
            int desde = 0;
            int hasta = 0;
             numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;                                                 
        }
        return numeros;

    
}
