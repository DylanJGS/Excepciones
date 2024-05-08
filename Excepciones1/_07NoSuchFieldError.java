package Excepciones1;

public class _07NoSuchFieldError {
    
//NoSuchFieldError se lanza cuando una aplicación intenta acceder a un campo que no existe en una clase.

    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        try {
            // Intenta acceder a un campo que no existe en la clase
            String value = MyClass.class.getField("nonExistentField").toString();
        } catch (NoSuchFieldError e) {
            e.printStackTrace();
        }
    }

    static class MyClass {
        public int existingField;
    }
}
//En este ejemplo, la clase intenta acceder al campo nonExistentField en la clase MyClass, que no existe. 
//Esto provocará un NoSuchFieldError al intentar acceder a un campo que no está definido en la clase.
