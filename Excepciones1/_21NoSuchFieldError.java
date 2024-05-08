package Excepciones1;


    
//La excepción NoSuchFieldError se lanza cuando se intenta acceder a un campo (variable) que no existe en 
//una clase. Esto puede ocurrir si el código hace referencia a un campo que fue eliminado o renombrado en 
//una versión más reciente de la clase

public class _21NoSuchFieldError {
    public static void main(String[] args) {
        try {
            // Intenta acceder a un campo que no existe en la clase
            int valor = ClaseEjemplo.campoInexistente;
        } catch (NoSuchFieldError excepcion) {
            System.out.println("¡Se produjo un NoSuchFieldError!");
            System.out.println("Mensaje de la excepción: " + excepcion.getMessage());
        }
    }

    class ClaseEjemplo {
        // Comenta o elimina esta línea para evitar el NoSuchFieldError
        public static int campoInexistente = 10;
    }
}
//En este ejemplo, intentamos acceder al campo campoInexistente en la clase ClaseEjemplo, pero este campo 
//no existe en la clase. Esto provocará un NoSuchFieldError, que se captura en el bloque catch y se muestra 
//un mensaje indicando que se produjo la excepción y su mensaje asociado.

//La excepción NoSuchFieldError se produce en tiempo de ejecución cuando se intenta acceder a un campo (variable) 
//que no existe en una clase. Sin embargo, en algunos casos, es posible que esta excepción no se capture y se 
//maneje de forma explícita en el código.