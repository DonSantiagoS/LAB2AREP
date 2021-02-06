package edu.escuelaing.arep.Lab1.app;

import edu.escuelaing.arep.Lab1.app.linkedlist.*;
import java.io.File;
import java.io.*;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------
 * 													APLICACION PRINCIPAL
 * ---------------------------------------------------------------------------------------------------------------------------
 * Aplicacion encargada de realizar la funcion de calcular la medua y la desviacion estandar, tomando los datos de una linkedlist
 * implementada particularmente
 * ---------------------------------------------------------------------------------------------------------------------------
 * @author Santiago Buitrago
 * ---------------------------------------------------------------------------------------------------------------------------
 */
public class App 
{
	
	
	public App(){
		
	}
    public static void main( String[] args )
    {
		lector leer= new lector();
		File archivo= new File(args[0]);
		leer.leerArchivo(archivo);
    }
	

}
