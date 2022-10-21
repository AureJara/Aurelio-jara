/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg6;

/**
 *
 * @author ACER NITRO 5
 */
public class ClassA extends ClassB {
    private String colorfav;
    public ClassA(String nombre, String apellido, int DNI, String color) {
        super(nombre, apellido, DNI);
        this.colorfav = colorfav;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nDNI: "+getDNI()+
                "\nColor Favorito: "+colorfav);
    }
}
