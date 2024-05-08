package Excepciones1;

import java.util.List;
import java.util.ArrayList;


//La excepción UnsupportedOperationException se lanza para indicar que la operación no es compatible 
//o no está soportada en el contexto actual. Por lo general, esta excepción se utiliza en clases que 
//implementan una interfaz que define ciertas operaciones, pero donde la implementación concreta de e
//sas operaciones no está disponible o no es posible.

public class _10UnsupportedOperationException  {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");

        try {
            lista.add(3, "Cuatro"); 
        } catch (UnsupportedOperationException excepcion) {
            System.out.println("¡Se produjo una UnsupportedOperationException!");
            System.out.println("Mensaje de la excepción: " + excepcion.getMessage());
        }
    }
}
//En este ejemplo, creamos una lista ArrayList y luego intentamos añadir un elemento en la posición 3 
//utilizando el método add(index, element). Sin embargo, ArrayList no soporta la inserción en posiciones 
//fuera del rango actual de la lista, por lo que se lanza una UnsupportedOperationException. 