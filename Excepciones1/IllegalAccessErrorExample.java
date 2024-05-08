
package Excepciones1;


import java.lang.reflect.InvocationTargetException;

//Se lanza cuando un programa intenta acceder a un campo o 
//método para el cual no tiene permisos. 
//Puede ser causado por problemas de control de acceso o cambios en las clases después de la compilación.

class SuperClase {
    private void metodoPrivado() {
        System.out.println("Método privado");
    }
}

public class IllegalAccessErrorExample {
    public static void main(String[] args) throws IllegalAccessException {
        try {
            SuperClase sc = new SuperClase();
            // Intenta acceder a un método privado
            sc.getClass().getMethod("metodoPrivado").invoke(sc);
        } catch (IllegalAccessError e) {
            System.out.println("Error de acceso ilegal: " + e.getMessage());
        } catch (NoSuchMethodException | InvocationTargetException e) {
            System.out.println("Error durante la reflexión: " + e.getMessage());
        }
    }
}

//Capturar IllegalAccessError permite manejar errores relacionados 
//con acceso a campos o métodos restringidos. 
//Este tipo de excepción generalmente indica problemas con los 
//permisos de acceso y puede ser causado por cambios en el código después de la compilación.
