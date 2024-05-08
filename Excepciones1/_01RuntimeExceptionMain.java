package Excepciones1;



//  La excepción RuntimeException es una clase base para excepciones que pueden ocurrir 
//durante la ejecución de un programa, suelen indicar errores en la lógica del programa, 
//como intentar acceder a un índice fuera de los límites de un array, dividir por cero, entre otros

public class _01RuntimeExceptionMain {
    public static void main(String[] args) {


        try {
            throw new RuntimeException("Ocurrió un error en tiempo de ejecución");
        } catch (RuntimeException excepcion) {
            System.out.println("Excepción capturada: " + excepcion.getMessage());
        }
    }
   
}
//En este ejemplo, se lanza una excepción RuntimeException con un mensaje personalizado. Esta excepción se 
//captura en el bloque catch y se muestra el mensaje utilizando el método getMessage() de la excepción
