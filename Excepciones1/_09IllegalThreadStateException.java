package Excepciones1;



//La excepción IllegalThreadStateException se lanza cuando se realiza una operación ilegal en un hilo. 
//Por ejemplo, intentar iniciar un hilo que ya ha sido iniciado o que ha sido detenido.


public class _09IllegalThreadStateException{
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Hilo en ejecución...");
        });

        // Iniciar el hilo dos veces, lo cual es ilegal
        try {
            thread.start();
            thread.start(); // Intenta iniciar el hilo nuevamente
        } catch (IllegalThreadStateException excepcion) {
            System.out.println("¡Se produjo una IllegalThreadStateException!");
            System.out.println("Mensaje de la excepción: " + excepcion.getMessage());
        }
    }
}
//En este ejemplo, creamos un nuevo hilo thread y lo iniciamos dos veces utilizando el método start(). 
//Esto provocará una IllegalThreadStateException en el segundo intento de inicio, ya que un hilo no 
//puede ser iniciado más de una vez.