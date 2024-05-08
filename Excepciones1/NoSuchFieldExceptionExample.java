/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones1;

/**
 *
 * @author LENOVO
 */
//NoSuchFieldException se lanza cuando se intenta acceder a un campo de una clase que no existe.
//Se utiliza en operaciones de reflexión donde se espera un campo 
//pero no se encuentra uno con el nombre o especificaciones requeridas.
import java.lang.reflect.*;

public class NoSuchFieldExceptionExample {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            Field field = clazz.getField("nonexistentField");
        } catch (NoSuchFieldException e) {
            System.out.println("Campo no encontrado: " + e.getMessage());
        }
    }
}
//Esta excepción se usa para controlar situaciones donde se intenta acceder a un 
//campo de una clase pero no se encuentra. Es especialmente útil para 
//operaciones de reflexión y garantiza que el programa maneje errores de manera 
//segura cuando no se puede acceder a un campo esperado.
