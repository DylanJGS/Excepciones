
package Excepciones1;

//Se lanza cuando se intenta enlazar un nombre o referencia que ya está enlazada a otro objeto,
//como en el contexto de Remote Method Invocation (RMI) o Java Naming and Directory Interface (JNDI).

import java.rmi.*;
import java.rmi.registry.*;

public class AlreadyBoundExceptionExample {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("miObjeto", new Remote() {
                private static final long serialVersionUID = 1L;
            });
            registry.bind("miObjeto", new Remote() {
                private static final long serialVersionUID = 1L;
            });  // Ya está enlazado
        } catch (AlreadyBoundException e) {
            System.out.println("Nombre ya enlazado: " + e.getMessage());
        } catch (RemoteException e) {
            System.out.println("Error remoto: " + e.getMessage());
        }
    }
}

//Capturar AlreadyBoundException permite manejar errores cuando 
//se intenta enlazar un nombre que ya está en uso, 
//evitando conflictos en aplicaciones distribuidas y sistemas de nombres.


