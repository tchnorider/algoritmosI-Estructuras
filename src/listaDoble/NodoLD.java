package listaDoble;

public class NodoLD {
	
	private int elemento;
	private NodoLD siguiente;
	private NodoLD anterior;

	public NodoLD getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoLD siguiente) {
		this.siguiente = siguiente;
	}
		
	public NodoLD getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoLD anterior) {
		this.anterior = anterior;
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	public NodoLD(int valor){
		this.elemento = valor;
		this.siguiente = null;
	}
}
