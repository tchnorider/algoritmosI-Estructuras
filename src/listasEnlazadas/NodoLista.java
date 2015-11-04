/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package listasEnlazadas;

/**
 *
 * @author RC
 */
public class NodoLista{
	private int dato;
	private NodoLista sig;

    //Constructor
    public NodoLista(int n){
        this.dato=n;
        this.sig=null;
    }

    //Dato
    public void setDato(int d){
        this.dato=d;
    }
    public int getDato(){
        return this.dato;
    }

    //Siguiente
    public void setSig(NodoLista s){
        this.sig=s;
    }
    public NodoLista getSig(){
        return this.sig;
    }
}
