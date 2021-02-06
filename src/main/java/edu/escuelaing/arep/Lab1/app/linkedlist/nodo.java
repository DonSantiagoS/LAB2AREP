package edu.escuelaing.arep.Lab1.app.linkedlist;

import java.util.List;


/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------
 * 													NODO
 * ---------------------------------------------------------------------------------------------------------------------------
 * Clase nodo: Nodo como parte de la implementacion propia de un LinkedList
 * ---------------------------------------------------------------------------------------------------------------------------
 * @author Santiago Buitrago
 * ---------------------------------------------------------------------------------------------------------------------------
 */
 
public class nodo {
	
    private Double elemento;
    private nodo nodoSiguiente;

    public nodo(Double numero){
        elemento = numero;
        nodoSiguiente= null;
    }

    public nodo(Double numero, nodo siguiente){
        elemento = numero;
        nodoSiguiente= siguiente;
    }

    public Double getElemento() {
        return elemento;
    }

    public void setElemento(Double numero) {
        elemento = numero;
    }

    public nodo getSiguiente() {
        return nodoSiguiente;
    }

    public void setSiguiente(nodo siguiente) {
        nodoSiguiente = siguiente;
    }
}