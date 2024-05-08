/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones1;

/**
 *
 * @author LENOVO
 */
//InvalidObjectException se lanza cuando un objeto no es válido durante la deserialización. 
//Se usa para indicar que el objeto deserializado no cumple con las expectativas o está corrupto.

import java.io.*;

public class InvalidObjectExceptionExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(new byte[0]));
            Object obj = ois.readObject();  // Error de objeto no válido
        } catch (InvalidObjectException e) {
            System.out.println("Objeto no válido: " + e.getMessage());
        }
    }
}
//Se usa para controlar errores durante la deserialización de objetos. 
//Capturar esta excepción permite tomar medidas correctivas cuando el objeto 
//deserializado no es el esperado o está dañado, evitando errores inesperados y proporcionando información sobre el problema.
