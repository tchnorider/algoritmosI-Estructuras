
package listasEnlazadas;

/**
 *
 * @author RC
 */
public class NodoLista{
	private int dato;
	private NodoLista sig;

    public NodoLista(int n){
        this.dato=n;
        this.sig=null;
    }

    public void setDato(int d){
        this.dato=d;
    }
    public int getDato(){
        return this.dato;
    }

    public void setSig(NodoLista s){
        this.sig=s;
    }
    public NodoLista getSig(){
        return this.sig;
    }
}
