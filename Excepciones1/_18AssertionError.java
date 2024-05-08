package Excepciones1;


    
//La excepción AssertionError se lanza cuando una afirmación (assert) falla. Las afirmaciones 
//se utilizan para verificar condiciones que el programador considera que siempre deben ser 
//verdaderas en un punto específico del código. Si una afirmación falla, significa que el código 
//tiene un error en algún lugar.

public class _18AssertionError  {
    public static void main(String[] args) {
        int edad = -1;

        assert edad >= 0 : "La edad no puede ser un número negativo";

        System.out.println("Edad: " + edad);
    }
}
//En este ejemplo, la afirmación assert edad >= 0 : "La edad no puede ser un número negativo"; 
//verifica que la variable edad sea mayor o igual a cero. Sin embargo, como edad es un número negativo, 
//la afirmación fallará y se lanzará un AssertionError.
