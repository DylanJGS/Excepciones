/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones1;

/**
 *
 * @author LENOVO
 */
//SQLException se lanza cuando ocurre un error relacionado con bases de datos o SQL.
//Es comúnmente utilizada en aplicaciones que interactúan con 
//bases de datos para manejar errores como conexiones fallidas, consultas incorrectas, o problemas con transacciones.

import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:invalid:url");
        } catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());
        }
    }
}

//Esta excepción es necesaria para manejar errores relacionados con bases de datos, 
//como errores de conexión, consultas malformadas, o problemas de transacciones. 
//Capturar SQLException permite a los desarrolladores responder 
//adecuadamente a problemas de bases de datos y tomar medidas para solucionarlos, evitando caídas abruptas del sistema.