
package Excepciones1;

//Se lanza cuando ocurre un error durante una transformación XML,
//como al usar XSLT para convertir XML en otro formato. 
//Esto puede deberse a errores en el proceso de transformación o problemas con la estructura del XML.

import javax.xml.transform.*;
import javax.xml.transform.stream.*;

public class TransformerExceptionExample {
    public static void main(String[] args) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            transformer.transform(
                new StreamSource("archivo.xml"),  // XML malformado
                new StreamResult(System.out)
            );
        } catch (TransformerException e) {
            System.out.println("Error durante la transformación XML: " + e.getMessage());
        }
    }
}

//Capturar TransformerException permite manejar errores durante la transformación XML, 
//como problemas con XSLT o errores de estructura en el XML. Esto ayuda a controlar 
//situaciones donde la transformación no puede completarse con éxito y tomar medidas correctivas.

