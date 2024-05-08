
package Excepciones1;


//Se lanza cuando hay un problema con el sistema de impresión, 
//como errores de hardware o problemas durante el proceso de impresión.

import java.awt.print.*;

public class PrinterExceptionExample {
    public static void main(String[] args) {
        try {
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable((graphics, pageFormat, pageIndex) -> {
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                graphics.drawString("Hola, impresión", 100, 100);
                return Printable.PAGE_EXISTS;
            });
            job.print();  // Intenta imprimir
        } catch (PrinterException e) {
            System.out.println("Error de impresión: " + e.getMessage());
        }
    }
}

//Capturar PrinterException permite controlar errores durante la impresión, 
//como fallas de hardware o problemas con la configuración de la impresora. 
//Esto permite al programa manejar problemas de impresión sin interrumpir completamente el flujo de trabajo.
