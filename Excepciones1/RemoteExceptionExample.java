/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones1;

/**
 *
 * @author LENOVO
 */
//RemoteException se lanza cuando hay errores durante llamadas a métodos remotos (RMI).
//Es comúnmente utilizada para indicar que algo salió mal durante la comunicación 
//entre aplicaciones distribuidas o cuando se trabaja con servicios remotos.
import java.net.MalformedURLException;
import java.rmi.*;

public class RemoteExceptionExample {
    public static void main(String[] args) throws NotBoundException, MalformedURLException {
        try {
            Remote remote = Naming.lookup("rmi://invalid-url");
        } catch (RemoteException e) {
            System.out.println("Error remoto: " + e.getMessage());
        }
    }
}

//Se usa para manejar errores cuando se trabaja con llamadas a métodos remotos. 
//Capturar esta excepción permite controlar errores durante la comunicación remota, 
//brindando una manera segura de manejar fallos en aplicaciones distribuidas o en entornos de servicios remotos.

