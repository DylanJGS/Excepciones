package Excepciones1;



//La excepción IllegalMonitorStateException se lanza cuando un hilo intenta realizar 
//una operación de monitorización (como wait(), notify(), o notifyAll()) en un objeto 
//en el que no tiene el bloqueo. Estas operaciones deben realizarse dentro de un bloque 
//synchronized que tenga el objeto monitor como referencia.
    
public class _08IllegalMonitorStateException {
    private static final Object monitor = new Object();

    public static void main(String[] args) throws InterruptedException {
        try {
            monitor.wait(); 
        } catch (IllegalMonitorStateException excepcion) {
            System.out.println("¡Se produjo una IllegalMonitorStateException!");
            System.out.println("Mensaje de la excepción: " + excepcion.getMessage());
        }
    }
}
//En este ejemplo, se intenta llamar al método wait() en el objeto monitor sin adquirir 
//previamente el bloqueo del monitor utilizando synchronized(monitor). Esto provocará una 
//IllegalMonitorStateException, que se captura en el bloque catch y se muestra un mensaje 
//indicando que se produjo la excepción y su mensaje asociado.
    