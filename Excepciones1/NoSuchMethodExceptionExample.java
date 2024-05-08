/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones1;

/**
 *
 * @author LENOVO
 */
//NoSuchMethodException se lanza cuando se intenta acceder a un método de una clase que no existe. 
//Al igual que NoSuchFieldException, es común en operaciones de reflexión y se usa 
//para indicar que un método no se encontró en la clase especificada.
import java.lang.reflect.*;

public class NoSuchMethodExceptionExample {
    public static void main(String[]args) throws ClassNotFoundException {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            Method method = clazz.getMethod("nonExistentMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("Método no encontrado: " + e.getMessage());
        }
    }
}
//NoSuchMethodException se usa para controlar errores cuando 
//se busca un método específico y no se encuentra. 
//Capturar esta excepción permite manejar errores relacionados con operaciones de reflexión, 
//como la invocación dinámica de métodos, y tomar medidas correctivas cuando no se puede encontrar el método esperado.