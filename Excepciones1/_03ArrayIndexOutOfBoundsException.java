package Excepciones1;



//La excepción ArrayIndexOutOfBoundsException se produce cuando se intenta acceder a un índice de un array que está fuera de 
//los límites del array.

public class _03ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        try {
            System.out.println("Accediendo al índice 5: " + numeros[5]);
        } catch (ArrayIndexOutOfBoundsException excepcion) {
            System.out.println("Se produjo una excepción: " + excepcion.getMessage());
        }

    }
}
//En este ejemplo se crea un array de enteros numeros con 5 elementos. Luego, intentamos acceder al indice 10, que están más 
//allá del rango válido para el array.
