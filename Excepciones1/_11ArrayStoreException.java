package Excepciones1;


    
//La excepción ArrayStoreException se lanza cuando se intenta almacenar un objeto de un tipo incompatible 
//en un array. Esta excepción se produce principalmente en tiempo de ejecución cuando se intenta asignar 
//un objeto a un array y el tipo del objeto no es un subtipo del tipo de componente del array.

public class _11ArrayStoreException {
    public static void main(String[] args) {
        Object[] array = new String[5]; 
        try {
            array[0] = 123; // Intenta asignar un entero a una posición de un array de String
        } catch (ArrayStoreException excepcion) {
            System.out.println("¡Se produjo una ArrayStoreException!");
            System.out.println("Mensaje de la excepción: " + excepcion.getMessage());
        }
    }
}
//En este ejemplo, creamos un array de String pero lo referenciamos como un array de Object. Luego, intentamos 
//asignar un entero a una posición del array, lo cual provoca una ArrayStoreException porque un entero no es 
//un subtipo de String.
