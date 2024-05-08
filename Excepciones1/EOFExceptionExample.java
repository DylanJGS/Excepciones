/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones1;

/**
 *
 * @author LENOVO
 */
//EOFException se lanza cuando se alcanza el final de un archivo o flujo de datos inesperadamente. 
//Es comúnmente utilizada para controlar errores durante la lectura de datos donde 
//se esperaba más información pero se alcanzó el final prematuramente.
import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(new byte[0]));
            dis.readInt(); // No hay datos para leer
        } catch (EOFException e) {
            System.out.println("Fin de archivo inesperado: " + e. getMessage());
        }
    }
}
//Se usa para controlar errores cuando se espera más datos de los que realmente hay.
//Capturar esta excepción permite al programa manejar situaciones donde se 
//termina un archivo o flujo de datos antes de lo esperado, evitando errores y proporcionando información sobre el problema.

