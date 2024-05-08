package Excepciones1;


//La excepción ClassCastException se produce cuando se intenta convertir un objeto a un tipo 
//que no es compatible con su tipo original.

public class _05ClassCastException {
    public static void main(String[] args) {
        Object objeto1 = "Hola"; 
        try {
            Integer num = (Integer) objeto1;
            System.out.println("El número es: " + num);
        } catch (ClassCastException excepcion) {

            System.out.println("Se produjo una excepción: " + excepcion.getMessage());
        }
    }
}
//En este ejemplo, creamos un objeto de tipo String y luego intentamos hacer un casting de ese 
//objeto a Integer. Como obj es de tipo String y no se puede convertir a Integer, se produce 
//una excepción ClassCastException.