package Excepciones1;


    
//La excepción UnsatisfiedLinkError se lanza cuando se produce un error al intentar cargar una biblioteca 
//nativa en Java. Esto puede ocurrir si la biblioteca nativa requerida no está disponible en el sistema o 
//si hay un problema al cargarla.
    
public class _23UnsatisfiedLinkError {    
    public static void main(String[] args) {
        try {
            System.loadLibrary("libtest");
        } catch (UnsatisfiedLinkError excepcion) {
            System.out.println("¡Se produjo un UnsatisfiedLinkError!");
            System.out.println("Mensaje de la excepción: " + excepcion.getMessage());
        }
    }
}
//En este ejemplo, se intenta cargar la biblioteca nativa libtest con System.loadLibrary("libtest");, y si 
//se produce un UnsatisfiedLinkError, se captura en el bloque catch y se muestra un mensaje indicando que 
//se produjo la excepción y su mensaje asociado.
