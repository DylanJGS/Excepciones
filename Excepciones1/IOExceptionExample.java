/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones1;

/**
 *
 * @author LENOVO
 */

//La clase IOException representa errores relacionados con operaciones de entrada/salida, 
//como lectura o escritura de archivos, errores de red o problemas con dispositivos de entrada/salida. 
//Se utiliza para indicar problemas con operaciones de disco, red o flujos de datos. 
//Muchas clases en Java, como las que trabajan con archivos o conexiones de red,
//lanzan IOException para señalar problemas inesperados.

import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("nonexistentfile.txt"));
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
//Se usa IOException cuando trabajas con archivos, sockets, o flujos de datos,
//y puede capturar cualquier problema de entrada/salida. 
//Es especialmente útil para tratar con errores de hardware o de red que podrían ser impredecibles.