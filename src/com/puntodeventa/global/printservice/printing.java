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
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.MediaSizeName;

/**
 *
 * @author Nato
 */
public class printing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // tu archivo a imprimir
		String file = "c:\\anadirUsuario.gif";
 
		// definimos el tipo a imprimir
		DocFlavor docFlavor = DocFlavor.INPUT_STREAM.GIF;
 
		// establecemos algunos atributos de la impresora
		PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
		aset.add(MediaSizeName.ISO_A4);
		aset.add(new Copies(1));
 
		// mi impresora por default
		PrintService service = PrintServiceLookup.lookupDefaultPrintService();
                System.out.println("Impresora: " + service.getName());
 
		Doc docPrint;
		try {
			docPrint = new SimpleDoc(new FileInputStream(file), docFlavor, null);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			return;
		}
 
		// inicio el proceso de impresion...
		DocPrintJob printJob = service.createPrintJob();
		try {
			printJob.print(docPrint, aset);
                        System.out.println("salida...");
		} catch (PrintException e) {
			e.printStackTrace();
		}
    }
}
