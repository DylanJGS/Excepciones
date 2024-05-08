/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones1;

/**
 *
 * @author LENOVO
 */
//DataFormatException se lanza cuando hay problemas con el formato de datos, 
//especialmente en el contexto de compresión y descompresión de datos.
//Se usa cuando los datos tienen un formato incorrecto o inesperado, lo que dificulta su procesamiento.

import java.util.zip.*;

public class DataFormatExceptionExample {
    public static void main(String[] args) {
        try {
            byte[] data = {1, 2, 3};  // Datos incorrectos para descompresión
            Inflater inflater = new Inflater();
            inflater.setInput(data);
            byte[] output = new byte[100];
            inflater.inflate(output);
        } catch (DataFormatException e) {
            System.out.println("Formato de datos incorrecto: " + e.getMessage());
        }
    }
}
//Se utiliza para manejar problemas de formato de datos, 
//como cuando se trabaja con archivos comprimidos o flujos de datos.
//Capturar esta excepción permite manejar errores cuando los datos 
//no se pueden descomprimir o procesar correctamente,
//proporcionando información sobre el problema y evitando fallos inesperados.