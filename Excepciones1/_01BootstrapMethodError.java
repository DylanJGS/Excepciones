package Excepciones1;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class _01BootstrapMethodError {

//La excepción BootstrapMethodError se lanza cuando se produce un error durante la resolución o 
//la invocación de un método "bootstrap" utilizado por las expresiones lambda y las clases anidadas 
//de forma estática introducidas en Java 8.

    public static void main(String[] args) {
        try {
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            MethodType type = MethodType.methodType(void.class, String.class);
            MethodHandle mh = lookup.findStatic(_01BootstrapMethodError.class, "someMethod", type);
            CallSite cs = new ConstantCallSite(mh.asType(MethodType.methodType(void.class, Object.class)));
        } catch (BootstrapMethodError e) {
            System.out.println("¡Se produjo un BootstrapMethodError!");
            System.out.println("Mensaje de la excepción: " + e.getMessage());
        } catch (NoSuchMethodException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void someMethod(String str) {
        System.out.println("Método de ejemplo invocado con: " + str);
    }
}
//En este ejemplo, la firma de someMethod en Main espera un argumento de tipo String, pero al crear 
//el CallSite, se utiliza un MethodHandle que espera un argumento de tipo Object.
