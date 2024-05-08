package Excepciones1;


    
//La excepción ArithmeticException se produce cuando ocurre una condición aritmética incorrecta 
//durante la ejecución de un programa en Java. Esto puede incluir operaciones como la división 
//por cero o un desbordamiento aritmético.

 public class _04ArithmeticException {
    public static void main(String[] args) {
        int dividendo = 10;
        int divisor = 0;

        try {
            int resultado = dividendo / divisor; 
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException excepcion) {
            System.out.println("Se produjo una excepción: " + excepcion.getMessage());
        }
    }
}
//En este ejemplo, al intentar dividir dividendo entre divisor (que es cero), se produce una 
//excepción ArithmeticException.
