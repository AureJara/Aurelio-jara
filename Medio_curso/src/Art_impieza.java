/*
                                                                ENUNCIADO
Se pide crear un programa que enliste diferentes articulos de limpieza con su precio, tipo(desinfectante o aromatizante), y dicho articulo.
 */

/**
 * @author JARA DONAYRE AURELIO MAURO
 */

public class Art_impieza 
{

    private static String articulo;
    private static String precio;
    
    class articulo
    {
        private String artuculo;

        public articulo(String artuculo) {
            this.artuculo = artuculo;
        }

        private void enlistar() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
    class precio
    {
        private float precio;

        public precio(float precio) {
            this.precio = precio;
        }
    }
    
    class tipo 
    {
        private char tipo;

        public tipo(char tipo) {
            this.tipo = tipo;
        }
    }
    public Art_impieza(){}
    
   public void enlistar(Art_impieza articulo)
   {
       System.out.println("Artuculo: "+ Art_impieza.articulo + "\n precio: " Art_impieza.precio + "Tipo: " + Art_impieza.tipo);
   }
   
   public static void main(String[] args) 
   {
        articulo articulo1 = new articulo("pino para pisos", "Aerosol","trapeador" );
        articulo1.enlistar();
   }
}
