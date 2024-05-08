package Excepciones1;



//La excepción IllegalStateException se utiliza para indicar que una operación no pudo 
//completarse correctamente debido a que el estado actual de un objeto no es compatible 
//con la operación que se está intentando realizar.
    
public class _07IllegalStateException { 
    private static boolean listo = false;

    public static void main(String[] args) {
        try {
            if (!listo) {
                throw new IllegalStateException("El objeto no está listo para ser utilizado");
            }
            // Realizar alguna operación con el objeto
            System.out.println("El objeto está listo, realizando alguna operación...");
        } catch (IllegalStateException excepcion) {
            System.out.println("¡Se produjo una IllegalStateException!");
            System.out.println("Mensaje de la excepción: " + excepcion.getMessage());
        }
    }
}
//En este ejemplo, la variable isReady indica si un objeto está listo para ser utilizado. 
//Si el objeto no está listo (isReady es false), se lanza una IllegalStateException indicando 
//que el objeto no está en un estado válido para realizar la operación.