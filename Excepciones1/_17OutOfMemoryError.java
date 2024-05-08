package Excepciones1;

import java.util.ArrayList;
import java.util.List;


    
//La excepción OutOfMemoryError se lanza cuando no hay suficiente memoria disponible para que el programa 
//pueda continuar su ejecución. Esto suele ocurrir cuando el programa intenta alojar más objetos en la 
//memoria de la que el sistema puede proporcionar.

public class _17OutOfMemoryError {
    public static void main(String[] args) {
        List<int[]> lista = new ArrayList<>();
        try {
            while (true) {
                lista.add(new int[1000000]); // Intenta añadir arrays grandes a la lista
            }
        } catch (OutOfMemoryError excepcion) {
            System.out.println("¡Se produjo un OutOfMemoryError!");
            System.out.println("Mensaje de la excepción: " + excepcion.getMessage());
        }
    }
}
//En este ejemplo, creamos una lista ArrayList y tratamos de añadir continuamente arrays grandes a la lista
// en un bucle infinito. Eventualmente, el programa se quedará sin memoria y lanzará un OutOfMemoryError. 