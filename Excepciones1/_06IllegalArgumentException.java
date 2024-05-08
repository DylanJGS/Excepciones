package Excepciones1;


    
//La excepción IllegalArgumentException se lanza cuando se pasa un argumento ilegal o inapropiado 
//a un método. Esto puede ocurrir, por ejemplo, cuando un método espera un argumento dentro de un 
//rango específico o con un formato particular, y el argumento pasado no cumple con estas condiciones.

public class _06IllegalArgumentException {
    public static void main(String[] args) {
        int valor = -5;

        try {
            if (valor <= 0) {
                throw new IllegalArgumentException("El valor debe ser positivo");
            }
            System.out.println("El valor es: " + valor);
        } catch (IllegalArgumentException excepcion) {
            System.out.println("Se produjo una excepción: " + excepcion.getMessage());
        }
    }
}
//En este ejemplo, intentamos imprimir el valor de una variable valor, pero antes verificamos si es
// menor o igual a cero. Si es así, lanzamos una excepción IllegalArgumentException con un mensaje 
//indicando que el valor debe ser positivo.