package Excepciones1;

public class _12VirtualMachineError {
    
//VirtualMachineError es la clase base para errores lanzados por la JVM en respuesta a situaciones que 
//afectan la propia máquina virtual. 
    public static void main(String[] args) {
        try {
            // Crea un gran número de hilos
            for (int i = 0; i < 100000; i++) {
                Thread thread = new Thread(() -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                thread.start();
            }
        } catch (VirtualMachineError e) {
            e.printStackTrace();
        }
    }
}
//En este ejemplo, se intenta crear un gran número de hilos en un bucle, lo que puede llevar a un 
//VirtualMachineError si la JVM no puede asignar suficiente memoria para la creación de los hilos.
