
package Excepciones1;

//Se lanza cuando hay problemas con operaciones de nomenclatura o búsqueda en JNDI. 
//Puede ser causado por errores de configuración, problemas de conexión o errores de búsqueda.

import javax.naming.*;

public class NamingExceptionExample {
    public static void main(String[] args) {
        try {
            InitialContext ctx = new InitialContext();
            Object obj = ctx.lookup("java:comp/env/jdbc/miDataSource");  // No existe
        } catch (NamingException e) {
            System.out.println("Error de nomenclatura: " + e.getMessage());
        }
    }
}
//Capturar NamingException permite manejar errores durante
//operaciones de búsqueda y nomenclatura en JNDI. 
//Esto es útil para evitar caídas inesperadas y para proporcionar información 
//sobre errores en entornos distribuidos y de directorios.
