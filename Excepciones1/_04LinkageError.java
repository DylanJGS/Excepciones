package Excepciones1;

public class _04LinkageError {
    
//se lanza cuando se produce un error enlazando una clase o una interfaz. Este tipo de error suele ocurrir 
//cuando hay un problema en la resolución de una referencia a una clase o interfaz durante la carga o 
//vinculación de clases en tiempo de ejecución.

      public static void main(String[] args) {
        // Intenta cargar una clase con un nombre incorrecto
        try {
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
//En este ejemplo, la clase Main intenta cargar la clase com.example.NonExistentClass, que no existe. 
//Esto provocará un LinkageError porque el sistema no puede encontrar la clase que se está intentando cargar.
