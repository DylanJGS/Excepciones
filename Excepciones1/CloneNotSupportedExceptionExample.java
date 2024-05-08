/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones1;

/**
 *
 * @author LENOVO
 */
//CloneNotSupportedException se lanza cuando un objeto no puede ser clonado porque 
//no implementa la interfaz Cloneable. 
//Esto sucede si el método clone() se invoca en un objeto que no admite clonación 
//o si se intenta clonar un objeto de una clase que no implementa la interfaz Cloneable.

class NoClone implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

public class CloneNotSupportedExceptionExample {
    public static void main(String[] args) {
        NoClone obj = new NoClone();
        try {
            NoClone copy = (NoClone) obj.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clonación no admitida: " + e.getMessage());
        }
    }
}

//Esta excepción se usa para evitar clonaciones indebidas. Al lanzarla, 
//puedes asegurarte de que solo se clonen objetos que realmente están destinados a ser clonados, 
//evitando problemas como copias no controladas o efectos secundarios inesperados.