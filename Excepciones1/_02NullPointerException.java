package Excepciones1;



//NullPointerException, esta excepción se lanza cuando se intenta acceder a un objeto que es null,
//es decir, que no apunta a ninguna dirección de memoria válida.

public class _02NullPointerException {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length()); 
        } catch (NullPointerException excepcion) {
            System.out.println("Se ha producido una excepcion del tipo: NullPointerException");
        }
    }
}
//En este ejemplo, la excepción NullPointerException se lanza automáticamente cuando se llama al 
//método length() en una cadena nula. 