package Excepciones1;


    
//La excepción NoSuchMethodError se lanza cuando se intenta llamar a un método que no existe en una clase. 
//Esto puede ocurrir si el código hace referencia a un método que fue eliminado o renombrado en una versión 
//más reciente de la clase, o si se utiliza una versión incorrecta de la biblioteca o clase que define el método.

public class _22NoSuchMethodError {
    public static void main(String[] args) {
        try {
            // Intenta llamar a un método que no existe en la clase
            ClaseEjemplo.metodoInexistente();
        } catch (NoSuchMethodError excepcion) {
            System.out.println("¡Se produjo un NoSuchMethodError!");
            System.out.println("Mensaje de la excepción: " + excepcion.getMessage());
        }
    }
    class ClaseEjemplo {
        // Comenta o elimina este método para evitar el NoSuchMethodError
        public static void metodoInexistente() {
            System.out.println("Este es un método de ejemplo");
        }

    }
}
//En este ejemplo, intentamos llamar al método metodoInexistente() en la clase ClaseEjemplo, pero este método 
//no existe en la clase.
