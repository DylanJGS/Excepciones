
package Excepciones1;

//Ocurre cuando se intenta acceder a una ubicación no válida en un documento de texto. 
//Es común en componentes Swing como JTextComponent, donde se trabaja con posiciones 
//de texto y el índice puede ser incorrecto.

import javax.swing.text.*;

public class BadLocationExceptionExample {
    public static void main(String[] args) {
        try {
            PlainDocument doc = new PlainDocument();
            doc.insertString(0, "Hola mundo", null);
            doc.remove(15, 1);  // Índice fuera de límites
        } catch (BadLocationException e) {
            System.out.println("Ubicación incorrecta: " + e.getMessage());
        }
    }
}

//Se usa para controlar errores cuando se trabaja con documentos de texto. 
//Capturar BadLocationException permite manejar intentos de acceder 
//a ubicaciones no válidas en un documento, evitando fallos inesperados.
