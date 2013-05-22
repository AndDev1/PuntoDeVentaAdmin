/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntodeventa.global.printservice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;

/**
 *
 * @author Nato
 */
public class PrintTest {

    public static void main(String args[]){  
        
        FileInputStream psStream = null;  
        try {  
            psStream = new FileInputStream("D:\\vPuntoVenta/ventas/2719745.pdf");  
            } catch (FileNotFoundException ffne) {  
                System.out.println("Archivo no encontrado: " + ffne.getMessage());
            }  
            if (psStream == null) {  
                return;  
            }  
        DocFlavor psInFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;  
        Doc myDoc = new SimpleDoc(psStream, psInFormat, null);    
        PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();  
        PrintService[] services = PrintServiceLookup.lookupPrintServices(psInFormat, aset);  
          
        // this step is necessary because I have several printers configured  
        PrintService myPrinter = null;  
        for (int i = 0; i < services.length; i++){              
            String svcName = services[i].toString();
            System.out.println("service found: " + svcName);  
            if (svcName.contains("printer closest to me")){  
                myPrinter = services[i];  
                System.out.println("my printer found: "+svcName);  
                break;  
            }  
        }  
          
        if (myPrinter != null) {              
            DocPrintJob job = myPrinter.createPrintJob();  
            try {  
                job.print(myDoc, aset);                
            } catch (Exception pe) {
                System.out.println("Error de impresion: "  + pe.getMessage());
            }  
        } else {  
            System.out.println("no printer services found");  
        }  
   }  
}
