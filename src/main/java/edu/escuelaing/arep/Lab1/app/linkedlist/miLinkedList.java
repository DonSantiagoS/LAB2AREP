package edu.escuelaing.arep.Lab1.app.linkedlist;

import java.util.List;


/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------
 * 													miLinkedList
 * ---------------------------------------------------------------------------------------------------------------------------
 * Clase miLinkedList: Implementacion propia de un LinkedList el cual es compatible con el API de java, asi mismo se implementaron
 * los metodos principales 
 * ---------------------------------------------------------------------------------------------------------------------------
 * @author Santiago Buitrago
 * ---------------------------------------------------------------------------------------------------------------------------
 */
 public class miLinkedList {
    
	private int size;
    private nodo head;

    public miLinkedList(){
        size = 0;
        head = new nodo(null);
    }

    public void agregar(double nuevo){
        if (size==0) {
            head = new nodo(nuevo);
        }
        else{
            nodo last = new nodo(nuevo);
            nodo nodoActual = head;
            while(nodoActual.getSiguiente()!= null){
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente(last);
        }
        size++;
    }

    public Double get(int elemento){
        if (elemento < 0 ){
            return null;
        }
        if (head != null){
            int i = 0;
            nodo nodoActual = head;
            while(i < elemento){
                if(nodoActual.getSiguiente() == null){
                    return null;
                }
                nodoActual = nodoActual.getSiguiente();
                i ++;
            }
            return nodoActual.getElemento();
        }
        return null;
    }
	
    public String toString() {
        String output = "";
        if (head != null) {
            nodo nodoActual = head;
            output += "[";
            boolean primero = true;
            while (nodoActual != null) {
                if(primero){
                    output += nodoActual.getElemento().toString();
                    primero = false;
                }
                else{output += ", " + nodoActual.getElemento().toString() ;}
                nodoActual = nodoActual.getSiguiente();
            }
            output += "]";

        }
        return output;
    }
    public int getSize(){
		return size;
	}
}