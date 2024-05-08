package Excepciones1;


//La excepción StackOverflowError se produce cuando se desborda la pila de llamadas (stack) debido 
//a una cantidad excesiva de llamadas recursivas.
    
public class _16StackOverflowError {
    
     public static void main(String[] args) {
        metodoRecursivo();
    }

    public static void metodoRecursivo() {
        metodoRecursivo(); // Llamada recursiva infinita
    }
    
}
//En este ejemplo, el método metodoRecursivo se llama a sí mismo de forma recursiva sin ningún caso 
//base que detenga la recursión. Esto provoca que se acumulen llamadas en la pila de llamadas hasta 
//que se desborde y se lance un StackOverflowError.

//No es recomendable intentar capturar un StackOverflowError con un bloque try-catch, ya que este tipo 
//de error generalmente indica un problema grave en el código, como una recursión infinita. 