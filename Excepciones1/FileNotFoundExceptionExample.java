/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones1;

/**
 *
 * @author LENOVO
 */
//FileNotFoundException es una subclase de IOException que se lanza cuando se intenta acceder a un archivo que no existe.
//Es comúnmente utilizada cuando se trabaja con archivos y directorios para manejar 
//la posibilidad de que el archivo solicitado no esté presente en el sistema de archivos.

import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("noexist.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }
}
//Usar FileNotFoundException es necesario cuando se trabaja con archivos para asegurarse de que 
//el código pueda manejar la ausencia de archivos o directorios,
//proporcionando una manera segura de continuar el flujo del programa sin interrumpirlo abruptamente.




