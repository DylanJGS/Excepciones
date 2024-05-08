package Excepciones1;



//La excepción NegativeArraySizeException se lanza cuando se intenta crear un array con 
//un tamaño negativo, lo cual no está permitido en Java ya que el tamaño de un array debe 
//ser un valor no negativo.

public class _14NegativeArraySizeException {   
    public static void main(String[] args) {
        try {
            int[] array = new int[-5]; // Intenta crear un array con tamaño negativo
        } catch (NegativeArraySizeException excepcion) {
            System.out.println("¡Se produjo una NegativeArraySizeException!");
            System.out.println("Mensaje de la excepción: " + excepcion.getMessage());
        }
    }
}
//En este ejemplo, intentamos crear un array de enteros con un tamaño de -5, lo cual 
//provoca una NegativeArraySizeException. 
