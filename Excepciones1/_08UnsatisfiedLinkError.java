package Excepciones1;

//UnsatisfiedLinkError se lanza cuando se produce un error al intentar cargar o enlazar una biblioteca 
//nativa en tiempo de ejecución. 

public class _08UnsatisfiedLinkError {
    static {
        // Intenta cargar una biblioteca nativa que no existe
        System.loadLibrary("nonExistentLibrary");
    }

    public static void main(String[] args) {
        // No se llegará a este punto si se lanza UnsatisfiedLinkError en la inicialización estática
        System.out.println("Hola mundo!");
    }

}
//En este ejemplo, el bloque estático intenta cargar una biblioteca nativa llamada "nonExistentLibrary" que no 
//existe. Esto provocará un UnsatisfiedLinkError durante la inicialización estática de la clase, por lo 
//que el mensaje "Hola mundo!" nunca se imprimirá.
