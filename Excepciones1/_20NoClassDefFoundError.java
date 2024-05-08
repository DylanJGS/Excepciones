package Excepciones1;


    
//La excepción NoClassDefFoundError se lanza cuando la JVM intenta cargar una clase en tiempo de ejecución, 
//pero la definición de la clase no se encuentra en el classpath en ese momento. Esto puede ocurrir si la 
//clase estaba presente durante la compilación pero no está disponible durante la ejecución, o si hubo un 
//problema al cargar la clase.

public class _20NoClassDefFoundError  {
     public static void main(String[] args) {
        try {
            // Intenta cargar una clase que no está en el classpath
            Class.forName("ClaseInexistente");
        } catch (ClassNotFoundException excepcion) {
            System.out.println("¡Se produjo un ClassNotFoundException!");
            System.out.println("Mensaje de la excepción: " + excepcion.getMessage());
        }
    }
}
//En este ejemplo, intentamos cargar la clase "ClaseInexistente" utilizando Class.forName(), pero esta clase 
//no existe en el classpath, lo que provocará un NoClassDefFoundError.
