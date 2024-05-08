/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones1;

/**
 *
 * @author LENOVO
 */
//SocketTimeoutException se lanza cuando un socket supera el tiempo de espera para una operación de red,
//como conectarse a un servidor o recibir datos. Es comúnmente utilizada para manejar situaciones 
//donde las operaciones de red pueden tardar más de lo esperado.

import java.io.IOException;
import java.net.*;

public class SocketTimeoutExceptionExample {
    public static void main(String[] args) throws IOException {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("localhost", 9999), 1000);  // Timeout de 1 segundo
        } catch (SocketTimeoutException e) {
            System.out.println("Tiempo de espera de socket excedido: " + e+ "Message()");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
//Se usa para controlar errores cuando un socket excede el tiempo de espera para una operación de red. 
//Capturar esta excepción permite al programa manejar operaciones de red de manera segura, 
//proporcionando tiempo para tomar medidas correctivas o intentar nuevamente, 
//evitando que el programa se bloquee indefinidamente.
