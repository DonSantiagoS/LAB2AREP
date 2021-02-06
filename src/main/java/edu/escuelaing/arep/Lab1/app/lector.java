package edu.escuelaing.arep.Lab1.app;

import edu.escuelaing.arep.Lab1.app.linkedlist.*;
import java.io.File;
import java.io.*;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------
 * 													LECTOR
 * ---------------------------------------------------------------------------------------------------------------------------
 * Aplicacion encargada de realizar la funcion de calcular la medua y la desviacion estandar, tomando los datos de una linkedlist
 * implementada particularmente
 * ---------------------------------------------------------------------------------------------------------------------------
 * @author Santiago Buitrago
 * ---------------------------------------------------------------------------------------------------------------------------
 */
 public class lector 
{
	private calcular calculo;
	private double media;
	private double desviacionEstandar;
	public lector(){
		calcular calculo= new calcular();
	}
	
	public void leerArchivo(File archivo){
		miLinkedList set= new miLinkedList();
		BufferedReader buffer = null;
        try {
            buffer = new BufferedReader(new FileReader(archivo));
            String puntero = buffer.readLine();
            while(puntero!=null) {
                String[] fila = puntero.split(" ");
                Double numero = Double.parseDouble(fila[0]);
                set.agregar(numero);
            }
            buffer.close();
            media = calculo.calcularMedia(set);
            desviacionEstandar = calculo.calcularDesviacionEstandar(set);
            System.out.println("La media del conjunto de numeros dados es: "+String.format("%.2f",media));
            System.out.println("La desviacion estandar del conjunto de numeros dados es: "+String.format("%.2f",desviacionEstandar));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Double getMedia() {
        return media;
    }

    public Double getDesviacionEstandar() {
        return desviacionEstandar;
    }

}
