
package Excepciones1;

//Se lanza cuando se intenta usar una propiedad o característica SAX 
//que no es compatible con el analizador SAX utilizado. 
//Esto puede ocurrir si el analizador no admite ciertas características o propiedades.

import javax.xml.parsers.*;
import org.xml.sax.*;

public class SAXNotSupportedExceptionExample {
    public static void main(String[] args) throws SAXNotRecognizedException {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setFeature("http://xml.org/sax/features/validation", false);  // No compatible
        } catch (SAXNotSupportedException e) {
            System.out.println("Propiedad SAX no soportada: " + e.getMessage());
        } catch (ParserConfigurationException e) {
            System.out.println("Error de configuración del parser: " + e.getMessage());
        }
    }
}

//Capturar SAXNotSupportedException permite manejar errores cuando 
//se intenta usar una propiedad o característica no admitida por el analizador SAX. 
//Esto proporciona una forma segura de evitar problemas durante el análisis de XML.
