package Excepciones1;

public class _10ThreadDeath {
    
//se lanza cuando se llama al método stop() en un hilo, lo que hace que el hilo muera. 

    public static void main(String[] args) {
        // Crea un nuevo hilo
        Thread thread = new Thread(() -> {
            try {
                // Simula alguna tarea
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Inicia el hilo
        thread.start();

        // Detiene el hilo abruptamente (método desaconsejado y peligroso)
        thread.stop();
    }
}
//En este ejemplo, el programa crea un nuevo hilo y lo inicia. Luego, llama al método stop() 
//en el hilo, lo que provocará que se lance un ThreadDeath y que el hilo muera. Es importante 
//tener en cuenta que el método stop() está desaconsejado y es peligroso, ya que puede dejar el 
//programa en un estado inconsistente.
