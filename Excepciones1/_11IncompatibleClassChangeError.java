package Excepciones1;

public class _11IncompatibleClassChangeError {
    
//IncompatibleClassChangeError se lanza cuando la definición de una clase ha cambiado de manera incompatible 
//después de que fue cargada en la JVM. 

    public static void main(String[] args) {
        try {
            // Crea una instancia de MyClass
            MyClass myClass = new MyClass();

            // Llama al método que ha sido eliminado de MyClass
            myClass.deletedMethod();
        } catch (IncompatibleClassChangeError e) {
            e.printStackTrace();
        }
    }
}
class MyClass {
    // Método que ha sido eliminado
    public void deletedMethod() {
        System.out.println("Hello from deleted method!");
    }
}
//En este ejemplo, la clase Main intenta llamar al método deletedMethod() en una instancia de MyClass. Sin embargo, 
//el método deletedMethod() ha sido eliminado de la clase MyClass, lo que provoca un IncompatibleClassChangeError.
