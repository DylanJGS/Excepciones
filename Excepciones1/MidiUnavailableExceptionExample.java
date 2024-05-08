
package Excepciones1;

//Indica que un dispositivo MIDI o recurso no está disponible. 
//Esto puede ocurrir cuando se intenta abrir un dispositivo
//MIDI que ya está en uso o que no puede ser encontrado.

import javax.sound.midi.*;

public class MidiUnavailableExceptionExample {
    public static void main(String[] args) {
        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();  // Puede lanzar MidiUnavailableException
        } catch (MidiUnavailableException e) {
            System.out.println("Dispositivo MIDI no disponible: " + e.getMessage());
        }
    }
}

//Capturar MidiUnavailableException permite manejar errores cuando
//se intenta acceder a dispositivos MIDI que no están disponibles. 
//Esto es útil para evitar fallas inesperadas en aplicaciones que dependen de dispositivos de música o sonido.

