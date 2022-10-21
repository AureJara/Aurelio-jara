/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana7;

/**
 *
 * @author Jara Donayre
 */

class persona{
    private String name;
    private String lastname;

    public persona(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    
}
class alumno extends persona {
    private String code;
    private String rol;

    public alumno(String code, String name, String lastname) {
        super(name, lastname);
        this.code = code;
    }
    
    }
    
  class profesor extends persona{
      private String code;

    public profesor(String code) {
        this.code = code;
        
    }
      
  }  


public class Semana7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        alumno a1=new alumno("E15", "sumaran","jara");
        profesor p1=new alumno("f20", "Cristian", "Garcia");
        System.out.println(a1.toString());
        System.out.println(p1.toString());
                }
    
}
