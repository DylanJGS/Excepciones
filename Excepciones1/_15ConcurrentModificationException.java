package Excepciones1;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;


//La excepción ConcurrentModificationException se lanza cuando se detecta una modificación concurrente no 
//permitida en una estructura de datos durante la iteración, es decir, cuando se intenta modificar una 
//colección mientras se está iterando sobre ella de forma concurrente (por ejemplo, en un hilo diferente).

 public class _15ConcurrentModificationException { 
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        try {
            Iterator<Integer> iterador = lista.iterator();
            while (iterador.hasNext()) {
                Integer numero = iterador.next();
                if (numero == 2) {
                    lista.remove(numero); // Intenta modificar la lista mientras se itera
                }
            }
        } catch (ConcurrentModificationException excepcion) {
            System.out.println("¡Se produjo una ConcurrentModificationException!");
            System.out.println("Mensaje de la excepción: " + excepcion.getMessage());
        }
    }
}
//En este ejemplo, creamos una lista ArrayList con algunos elementos y luego intentamos eliminar un elemento 
//de la lista mientras se itera sobre ella utilizando un Iterator. Esto provoca una ConcurrentModificationException 
//porque se está intentando modificar la lista mientras se itera sobre ella.