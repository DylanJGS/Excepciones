/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones1;

/**
 *
 * @author LENOVO
 */
//InstantiationException se lanza cuando se intenta crear una 
//instancia de una clase que no puede ser instanciada, 
//como una clase abstracta o interfaz. Suele usarse en operaciones de 
//reflexión donde se espera una clase concreta pero se encuentra con una que no puede ser instanciada.

public class InstantiationExceptionExample {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.lang.Cloneable");  // Cloneable es una interfaz
            Cloneable obj = (Cloneable) clazz.newInstance();
        } catch (InstantiationException e) {
            System.out.println("No se puede instanciar una clase abstracta o interfaz: " + e.getMessage());
        } catch (IllegalAccessException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

//InstantiationException es útil para manejar errores cuando se 
//intenta crear instancias de clases que no están destinadas a ser instanciadas directamente,
//como interfaces o clases abstractas. Al capturar esta excepción, 
//puedes evitar errores que ocurren al instanciar incorrectamente y tomar medidas para corregir el problema.
