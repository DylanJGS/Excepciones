/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones1;

/**
 *
 * @author LENOVO
 */
//TimeoutException se lanza cuando se excede un tiempo de espera en operaciones que 
//esperan una respuesta o terminación. Es comúnmente utilizada en programación concurrente, 
//operaciones de red, o cuando se establecen límites de tiempo para ciertas tareas.

import java.util.concurrent.*;

public class TimeoutExceptionExample {
    public static void main(String[]args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> {
            Thread.sleep(2000);  // Simula una tarea larga
            return "Hecho";
        });

        try {
            String result = future.get(1, TimeUnit.SECONDS);  
        } catch (TimeoutException e) {
            System.out.println("Tiempo de espera excedido: " + e.getMessage());
        }
    }
}
//TimeoutException es útil para controlar operaciones que podrían tardar más de lo esperado. 
//Al capturar esta excepción, puedes tomar decisiones sobre cómo manejar la situación, 
//como cancelar la operación o intentar nuevamente, garantizando que el programa no se quede bloqueado indefinidamente.