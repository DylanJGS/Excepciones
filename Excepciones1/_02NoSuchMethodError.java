package Excepciones1;

public class _02NoSuchMethodError {
    
//La excepción NoSuchMethodError se lanza cuando se intenta llamar a un método que no existe en una clase. 
//Esto puede ocurrir si el código hace referencia a un método que fue eliminado o renombrado en una versión 
//más reciente de la clase que se está utilizando.

    public static void main(String[] args) {
        try {
            // Intenta llamar a un método que no existe
            someMethod();
        } catch (NoSuchMethodError e) {
            System.out.println("¡Se produjo un NoSuchMethodError!");
            System.out.println("Mensaje de la excepción: " + e.getMessage());
        }
    }
    // Este método no existe en la clase
    public static void someMethod() {
        // Este método no existe en la clase
    }
}
//El ejemplo intenta llamar a un método llamado someMethod() que no está definido en la clase. Como resultado, 
//cuando se ejecuta el programa, se produce un NoSuchMethodError