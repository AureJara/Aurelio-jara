/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER NITRO 5
 */
public class ejemplo1 {

public interface IManual
{
    void Suspender();
    void Reiniciar();
}


public abstract class Proceso
{
    public abstract void Iniciar();
    public abstract void Finalizar();
}



public class ProcesoManual : Proceso, IManual
{
    public override void Iniciar() { Console.WriteLine("Proceso Manual 1 -> Iniciar"); }
    public void Suspender() { Console.WriteLine("Proceso Manual 1 -> Suspender"); }
    public void Reiniciar() { Console.WriteLine("Proceso Manual 1 -> Reiniciar"); }
    public override void Finalizar() 
    {
        Console.WriteLine("Proceso Manual 1 -> Finalizar"); 
    }
}
 


public class ProcesoAutomaizado : Proceso
{
    public override void Iniciar() 
    { 
        Console.WriteLine("Proceso Automatizado 1 -> Iniciar"); 
    }
    public override void Finalizar()
    {
        Console.WriteLine("Proceso Automatizado 1 -> Finalizar"); 
    }
}
    
}
