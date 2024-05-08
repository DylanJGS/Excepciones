
package Excepciones1;

//Se lanza cuando ocurre un problema en el Abstract Window Toolkit (AWT), 
//la biblioteca de Java para interfaces gráficas.
//Esto puede deberse a errores de inicialización o problemas con componentes gráficos.

import java.awt.*;
import java.awt.AWTException;
import java.awt.Robot;

public class AWTExceptionExample {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();  // Intenta usar el Robot para automatizar GUI
            robot.mouseMove(100, 100);
        } catch (AWTException e) {
            System.out.println("Error en AWT: " + e.getMessage());
        }
    }
}

//El uso del Robot en Java puede lanzar AWTException si hay un problema con el sistema gráfico. 
//Capturar esta excepción permite controlar errores que pueden surgir durante operaciones relacionadas con la GUI.
