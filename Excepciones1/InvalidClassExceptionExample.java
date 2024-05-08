/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones1;

/**
 *
 * @author LENOVO
 */
//InvalidClassException se lanza cuando hay problemas con la serialización/deserialización 
//debido a cambios en la clase o versiones incompatibles. 
//Es comúnmente utilizada cuando se trabaja con objetos serializados 
//para indicar que la clase no puede ser deserializada correctamente.
import java.io.*;

public class InvalidClassExceptionExample {
    public static void main(String[] args) throws FileNotFoundException, IOException  {
        try {
            FileOutputStream fos = new FileOutputStream("file.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("data");  // Ejemplo de objeto serializado
            oos.close();
            
            FileInputStream fis = new FileInputStream("file.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();  // Error de clase incompatible
        } catch (InvalidClassException e) {
            System.out.println("Clase no válida para serialización: " + e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e+" Message()");
        }
    }
}
//Se usa para controlar errores cuando se trabaja con objetos serializados.
//Capturar esta excepción permite evitar errores inesperados cuando una clase ha cambiado 
//de forma que la deserialización ya no es posible, proporcionando una manera segura de 
//manejar la incompatibilidad de versiones.

