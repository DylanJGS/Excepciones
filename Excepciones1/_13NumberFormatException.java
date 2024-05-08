package Excepciones1;


    
//La excepción NumberFormatException se lanza cuando se intenta convertir una cadena a un tipo numérico, 
//pero el formato de la cadena no es válido para ese tipo numérico. Por ejemplo, al intentar convertir una 
//cadena que no representa un número válido a un tipo int, float, double, etc.

public class _13NumberFormatException {
    public static void main(String[] args) {
        String string = "abc";

        try {
            int numero = Integer.parseInt(string); // Intenta convertir una cadena no numérica a un entero
        } catch (NumberFormatException excepcion) {
            System.out.println("¡Se produjo una NumberFormatException!");
            System.out.println("Mensaje de la excepción: " + excepcion.getMessage());
        }
    }

}
//En este ejemplo, intentamos convertir la cadena "abc" a un entero utilizando Integer.parseInt(), lo cual no 
//es posible ya que la cadena no representa un número válido.
