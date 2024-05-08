package Excepciones1;

//UnsupportedClassVersionError se lanza cuando la JVM intenta cargar una clase compilada con una versión de Java 
//más reciente de la que la JVM puede manejar.

public class _09UnsupportedClassVersionError {
    public static void main(String[] args) {
        try {
            // Intenta cargar una clase compilada con una versión de Java superior
            Class.forName("Java11Class");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static class Java11Class {
        public static void main(String[] args) {
            System.out.println("Hello from Java 11!");
        }
    }
}
//En este ejemplo, la clase Main intenta cargar la clase Java11Class, que está definida dentro de la misma clase. 
//Sin embargo, Java11Class está compilada con una versión de Java superior a la que se está utilizando para ejecutar 
//el programa. Esto provocará un UnsupportedClassVersionError al intentar cargar la clase Java11Class.
