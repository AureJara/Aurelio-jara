package Semana9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;





class estudiante{
    private String name;
    private int nota1;
    private int nota2;
    private int nota3;

    public estudiante(String name, int nota1, int nota2, int nota3) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota3;
        this.nota3 = nota3;
    }    
    String informacion(){
        String aprobo;
        if ((this.nota1+this.nota2+this.nota3)/3 >= 10.5){
            aprobo="APROBO"; 
        }else{
            aprobo="DESAPROBO";
        }
        return this.name+"\t"+this.nota1+"\t"+this.nota2+"\t"+this.nota3+"\t"+aprobo;
    }
    String dato(){
        return this.name+","+this.nota1+","+this.nota2+","+this.nota3;
    }
    float Promedio(){
        float promedio;
        promedio=(nota1+nota2+nota3)/3;
        if(promedio>=10.5)
            System.out.println("Aprobo");
        else
            System.out.println("Desaprobo");
            
        return 0;
    }
}
class metodo{
    ArrayList<estudiante> lista=new ArrayList<>();
    File arch=new File("ABC.txt");    
    void escribir()throws IOException{
        if(!arch.exists()){
            arch.createNewFile();
        }
        try (PrintWriter pw = new PrintWriter(arch)) {
            for(estudiante p: lista){
                pw.println(p.dato());
            }
        }
        
    } 
    
    void leer()throws IOException{
        if(!arch.exists()){
            arch.createNewFile();
        }
        BufferedReader br=new BufferedReader(new FileReader(arch));
        String cad;
        while((cad=br.readLine())!=null){
            String cad2[]=cad.split(",");
            lista.add(new estudiante(cad2[0],
                    Integer.parseInt(cad2[1]), 
                    cad2[2].charAt(0)));
        }
    }
    void ingresar(estudiante p){
        lista.add(p);
    }
    void mostrar(){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).informacion());
        }
    }
    
}


public class ejer6 {
    public static void main(String[] args) throws IOException{              
        metodo met=new metodo();
        met.ingresar(new estudiante("Alan", 15, 16, 17));
        met.ingresar(new estudiante("Toledo", 11, 9, 12));
        met.ingresar(new estudiante("Acuña", 0, 12, 10));
        met.mostrar();
        met.escribir();
    }
    
    
}