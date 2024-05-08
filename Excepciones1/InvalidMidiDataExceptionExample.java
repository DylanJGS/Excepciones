
package Excepciones1;

//Esta excepción se lanza cuando se intenta procesar datos MIDI 
//(Musical Instrument Digital Interface) no válidos. 
//Se puede producir por errores en la estructura de mensajes MIDI o por datos corruptos.

import javax.sound.midi.*;

public class InvalidMidiDataExceptionExample {
    public static void main(String[] args) {
        try {
            ShortMessage message = new ShortMessage();
            message.setMessage(0xF0, 0, 64, 127);  // Comando MIDI no válido
        } catch (InvalidMidiDataException e) {
            System.out.println("Datos MIDI no válidos: " + e.getMessage());
        }
    }
}

//Esta excepción se usa para controlar errores cuando se trabaja con datos MIDI. 
//Capturar InvalidMidiDataException permite manejar problemas con mensajes MIDI 
//no válidos o malformados, evitando que estos errores causen problemas 
//en la ejecución de programas que trabajan con música o sonido.
