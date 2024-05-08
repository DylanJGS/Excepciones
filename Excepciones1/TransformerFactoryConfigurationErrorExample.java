
package Excepciones1;

//Se lanza cuando hay errores de configuración en TransformerFactory, 
//que se usa para crear transformadores para procesamiento XML, como XSLT.
//Puede deberse a configuraciones incorrectas o problemas con la fábrica de transformadores.

import javax.xml.transform.*;
import javax.xml.transform.stream.*;

public class TransformerFactoryConfigurationErrorExample {
    public static void main(String[] args) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            transformer.transform(new StreamSource("archivo.xml"), new StreamResult(System.out));
        } catch (TransformerFactoryConfigurationError e) {
            System.out.println("Error de configuración de TransformerFactory: " + e.getMessage());
        } catch (TransformerException e) {
            System.out.println("Error durante la transformación XML: " + e.getMessage());
        }
    }
}

//Capturar TransformerFactoryConfigurationError permite manejar errores
//relacionados con la configuración de la fábrica de transformadores. 
//Esto es importante para evitar problemas en aplicaciones que 
//dependen de la transformación de XML, proporcionando una manera 
//segura de controlar fallas de configuración y tomar medidas correctivas.
