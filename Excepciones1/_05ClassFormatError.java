package Excepciones1;

public class _05ClassFormatError {

//ClassFormatError se lanza cuando la JVM detecta que el formato de un archivo de clase no es válido. 
//Esto puede suceder si el archivo .class está dañado o si no cumple con las especificaciones del 
//formato de archivo de clase de Java.

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.loadClassWithFormatError();
    }

    static class MyClass {
        public void loadClassWithFormatError() {
            try {
                // Intenta cargar una clase con un nombre incorrecto
                Class.forName("com.example.NonExistentClass");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
//En este ejemplo, la clase MyClass tiene un método loadClassWithFormatError() que intenta cargar una 
//clase con el nombre incorrecto com.example.NonExistentClass, lo que provocará un ClassNotFoundException. 
//Aunque este ejemplo no provoca directamente un ClassFormatError, ilustra cómo se puede tratar con 
//excepciones relacionadas con la carga de clases dentro de una clase en Java.
