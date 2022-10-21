/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.util.Random;

/**
 *
 * @author ACER NITRO 5
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    static int size = 20;
	
	public static void main(String[] args){
		int[] vector = new int[size];
		llenaVector(vector);
		imprimeVector(vector);
	}
	
	public static int[] llenaVector(int[] vector){
		for(int i=0;i<vector.length;i++){
			vector[i] = new Random().nextInt(40);
		}
		return vector;
	}
	public static void imprimeVector(int[] vector){
		for(int i=0;i<vector.length;i++){
			System.out.print(String.valueOf(vector[i])+" ");
		}
	}
}
