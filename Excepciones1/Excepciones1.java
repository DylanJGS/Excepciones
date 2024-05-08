/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones1;

/**
 *
 * @author LENOVO
 */
//1. Exception
//La clase Exception es la clase base para todas las excepciones en Java que no son errores de sistema o tiempo de ejecución. 
//Se utiliza como padre para todas las excepciones verificadas (checked exceptions), 
//que son aquellas que los métodos deben declarar en sus firmas si pueden lanzarlas. 
//El uso principal de Exception es capturar todas las excepciones que no están definidas por un tipo específico,  
//permitiendo manejar errores de manera genérica.

public class Excepciones1 {
    public static void main(String[] args) {
        try {
            throw new Exception("Error genérico");
        } catch (Exception e) {
            System.out.println("Capturada Exception: " + e.getMessage());
        }
    }
}

//Este tipo de excepción es útil cuando se necesita capturar cualquier excepción en general, 
//brindando un mecanismo de seguridad para errores inesperados que podrían surgir durante la ejecución de un programa.