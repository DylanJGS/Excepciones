package Excepciones1;


    
//La excepción UnknownError se lanza cuando se produce un error que no se puede clasificar en ninguna de las 
//otras categorías de excepciones. Esto puede ocurrir, por ejemplo, cuando se produce un error interno en la 
//JVM que no se puede identificar o clasificar adecuadamente.
    
public class _25UnknownError {    
    public static void main(String[] args) {
        try {
            // Simula un error desconocido lanzando una excepción personalizada
            throw new UnknownErrorException("Este es un error desconocido");
        } catch (UnknownError excepcion) {
            System.out.println("¡Se produjo un UnknownError!");
            System.out.println("Mensaje de la excepción: " + excepcion.getMessage());
        }
    }
}

class UnknownErrorException extends UnknownError {
    public UnknownErrorException(String message) {
        super(message);
    }
}

