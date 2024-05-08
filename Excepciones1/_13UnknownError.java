package Excepciones1;

public class _13UnknownError {
    
//UnknownError se lanza cuando se produce un error desconocido. Es una subclase de Error y se utiliza 
//para situaciones excepcionales que no se pueden clasificar de forma más específica. 
    public static void main(String[] args) {
        try {
            // Lanza un UnknownError
            throw new UnknownError("Este es un error desconocido");
        } catch (UnknownError e) {
            e.printStackTrace();
        }
    }
}
//En este ejemplo, se crea una instancia de UnknownError con un mensaje descriptivo y se lanza. La excepción 
//es capturada en un bloque catch y se imprime la traza de la pila.






