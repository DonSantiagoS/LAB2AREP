package edu.escuelaing.arep.Lab1.app;

import edu.escuelaing.arep.Lab1.app.linkedlist.*;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------
 * 													CALCULAR
 * ---------------------------------------------------------------------------------------------------------------------------
 * Aplicacion encargada de realizar la funcion de calcular la media y la desviacion estandar, tomando los datos de una linkedlist
 * implementada particularmente
 * ---------------------------------------------------------------------------------------------------------------------------
 * @author Santiago Buitrago
 * ---------------------------------------------------------------------------------------------------------------------------
 */

public class calcular{
	
	
	public calcular(){
		
	}
	
	public double calcularMedia(miLinkedList set){
		double suma=0;
		int longitud=set.getSize();
		for (int i=0;i<longitud;i++){
			suma+=set.get(i);
		}
		double media=suma/longitud;
		return media;
	}
	
	public double calcularDesviacionEstandar(miLinkedList set){
		double media= calcularMedia(set);
		double suma=0;
		int longitud=set.getSize();
		for (int i=0;i<longitud;i++){
			suma+=Math.pow((set.get(i)-media),2);
		}
		double desviacionEstandar= Math.sqrt((suma/(longitud-1)));
		return desviacionEstandar;
	}
}