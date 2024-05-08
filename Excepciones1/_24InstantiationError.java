package Excepciones1;


    
//La excepción InstantiationError se lanza cuando ocurre un error durante la instancia de una clase. 
//Por lo general, esto sucede cuando se intenta instanciar una clase abstracta o una interfaz, o cuando 
//la clase no tiene un constructor accesible o no tiene un constructor predeterminado y se intenta 
//instanciarla utilizando Class.newInstance().
    
public class _24InstantiationError {    
    public static void main(String[] args) {
        try {
            // Intenta instanciar una clase sin un constructor público
            NoConstructorClaseEjemplo clase = NoConstructorClaseEjemplo.class.newInstance();
        } catch (InstantiationException | IllegalAccessException excepcion) {
            System.out.println("¡Se produjo un InstantiationException o IllegalAccessException!");
            System.out.println("Mensaje de la excepción: " + excepcion.getMessage());
        }
    }
}

class NoConstructorClaseEjemplo {
    // Este es un constructor privado, lo que hace que la clase no tenga un constructor público
    private NoConstructorClaseEjemplo() {
    }
}
//En este ejemplo, la clase NoConstructorClaseEjemplo no tiene un constructor público, lo que hace que 
//no se pueda instanciar directamente. Al intentar instanciarla utilizando Class.newInstance(), se lanzará 
//un InstantiationException o un IllegalAccessException
