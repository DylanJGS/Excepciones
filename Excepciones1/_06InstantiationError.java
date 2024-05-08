package Excepciones1;

public class _06InstantiationError {

//InstantiationError se lanza cuando se produce un error durante la creación de una instancia de una clase abstracta, 
//una interfaz, una clase sin un constructor accesible o una clase que no puede ser instanciada por otras razones.

    public static void main(String[] args) {
        try {
            // Intenta crear una instancia de una clase abstracta
            AbstractClass instance = new AbstractClassImpl();
        } catch (InstantiationError e) {
            e.printStackTrace();
        }
    }

    static abstract class AbstractClass {
        public abstract void method();
    }

    static class AbstractClassImpl extends AbstractClass {
        @Override
        public void method() {
            System.out.println("Method implementation");
        }
    }
}
//En este ejemplo, la clase Main intenta crear una instancia de la clase AbstractClass, que es abstracta. Esto provocará 
//un InstantiationError porque no se puede crear una instancia de una clase abstracta directamente.
