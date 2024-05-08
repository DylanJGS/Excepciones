/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones1;

/**
 *
 * @author LENOVO
 */
//ParseException se lanza cuando hay problemas para analizar o interpretar datos, 
//como fechas, números, o cadenas de caracteres. 
//Se usa comúnmente en operaciones que implican conversión de texto a formatos específicos.

import java.text.*;

public class ParseExceptionExample {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            sdf.parse("invalid-date");  // Fecha no válida
        } catch (ParseException e) {
            System.out.println("Error de análisis: " + e.getMessage());
        }
    }
}
//ParseException se usa para manejar errores durante la interpretación de datos, 
//como cuando se intenta convertir texto a un formato específico y algo sale mal. 
//Capturar esta excepción permite tomar medidas para corregir errores de formato
//y evitar fallas durante operaciones críticas, como el procesamiento de fechas o tiempos.
