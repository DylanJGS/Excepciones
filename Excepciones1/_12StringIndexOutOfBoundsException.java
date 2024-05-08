package Excepciones1;


    
//La excepción StringIndexOutOfBoundsException se lanza cuando se intenta acceder a un índice 
//fuera del rango válido para una cadena (String). Esto puede ocurrir al intentar acceder a un 
//carácter en una posición que está más allá de los límites de la cadena.

public class _12StringIndexOutOfBoundsException {    
    public static void main(String[] args) {
        String string = "Hola";

        try {
            char caracter = string.charAt(10); // Intenta acceder a un índice fuera del rango de la cadena
        } catch (StringIndexOutOfBoundsException excepcion) {
            System.out.println("¡Se produjo una StringIndexOutOfBoundsException!");
            System.out.println("Mensaje de la excepción: " + excepcion.getMessage());
        }
    }
}
//En este ejemplo, intentamos acceder al carácter en la posición 10 de la cadena "Hola", que 
//está más allá de los límites válidos de la cadena (los índices válidos para esta cadena son 0, 1, 2 y 3).
