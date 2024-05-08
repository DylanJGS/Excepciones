package Excepciones1;

public class _03ClassCircularityError {
    
//se lanza cuando una dependencia circular entre dos o más clases es detectada durante la inicialización 
//estática de una clase. Esto significa que una clase está tratando de acceder a otra clase que a su vez 
//está tratando de acceder a la primera clase, creando un ciclo de dependencia.
    static {
        B.doSomething();
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }


}
class B {
    static {
        _03ClassCircularityError.main(null);
    }

    public static void doSomething() {
        System.out.println("Doing something in B");
    }
}

