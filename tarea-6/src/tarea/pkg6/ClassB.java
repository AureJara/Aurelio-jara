/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg6;

/**
 *
 * @author ACER NITRO 5
 */
public class ClassB implements InterfaceB, InterfaceA {
    private String nombre;
    private String apellido;
    private int DNI;
    public ClassB(String nombre, String apellido, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getDNI() {
        return DNI;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nDNI: "+getDNI());
    }
    @Override
    public void interfazB() {
        System.out.println("Esta es la Interface de B");
    }

    @Override
    public void interfazA() {
        System.out.println("Esta es la Interface de A");
    }
}
