package listasEnlazadas;

public class Lista implements ILista {

	private NodoLista inicio;
	private NodoLista fin;

	public Lista() {
		this.inicio = null;
		this.fin = null;
	}

	public void setInicio(NodoLista i) {
		inicio = i;
	}

	public NodoLista getInicio() {
		return inicio;
	}

	public void setFin(NodoLista f) {
		fin = f;
	}

	public NodoLista getFin() {
		return fin;
	}

	@Override
	public boolean esVacia() {
		if (this.inicio == null)
			return true;
		else
			return false;
	}

	@Override
	public void agregarInicio(int n) {
		NodoLista nuevo = new NodoLista(n);
		nuevo.setSig(inicio);
		this.inicio = nuevo;
		if (this.fin == null)
			this.fin = nuevo;
	}

	@Override
	public void agregarFinal(int valor) {
		if (this.esVacia())
			this.agregarInicio(valor);
		else {
			NodoLista aux = this.inicio;
			while (aux.getSig() != null)
				aux = aux.getSig();
			NodoLista neoNodo = new NodoLista(valor);
			aux.setSig(neoNodo);
			this.fin = neoNodo;
		}
	}

	@Override
	public void borrarInicio() {
		if (!this.esVacia()) {
			this.inicio = this.inicio.getSig();
		}
	}

	@Override
	public void borrarFin() {
		if (!this.esVacia()) {
			if (this.inicio == this.fin)
				this.borrarInicio();
			else {
				NodoLista aux = this.inicio;
				while (aux.getSig().getSig() != null)
					aux = aux.getSig();
				this.fin = aux;
				this.fin.setSig(null);
			}
		}
	}

	@Override
	public void vaciar() {
		while (inicio != null)
			borrarInicio();
	}

	@Override
	public void mostrar() {
		if (this.esVacia())
			System.out.println("Lista vacia");
		else {
			NodoLista aux = this.inicio;
			while (aux != null) {
				System.out.println(aux.getDato());
				aux = aux.getSig();
			}
		}
	}

	@Override
	public void agregarOrd(int n) {
		if (this.esVacia() || this.inicio.getDato() >= n) {
			this.agregarInicio(n);
			return;
		}
		if (this.fin.getDato() <= n) {
			this.agregarFinal(n);
			return;
		}
		NodoLista aux = this.inicio;
		while (aux.getSig() != null && aux.getSig().getDato() < n)
			aux = aux.getSig();
		NodoLista nuevo = new NodoLista(n);
		nuevo.setSig(aux.getSig());
		aux.setSig(nuevo);
	}

	@Override
	public void borrarElemento(int n) {
		if (this.esVacia())
			return;
		if (this.inicio.getDato() == n)
			this.borrarInicio();
		else {
			NodoLista aux = this.inicio;
			while (aux.getSig() != null && aux.getSig().getDato() != n)
				aux = aux.getSig();
			if (aux.getSig() != null) {
				NodoLista borrar = aux.getSig();
				aux.setSig(borrar.getSig());
				borrar.setSig(null);
			}
		}
	}

	@Override
	public int cantElementos() {
		int cont = 0;
		if (!this.esVacia()) {
			NodoLista aux = this.inicio;
			while (aux != null) {
				aux = aux.getSig();
				cont++;
			}
		}
		return cont;
	}

	@Override
	public NodoLista obtenerElemento(int valor) {
		NodoLista nodoAux = this.inicio;
		while (nodoAux != null && nodoAux.getDato() != valor)
			nodoAux = nodoAux.getSig();
		return nodoAux;
	}

	@Override
	public void mostrarREC(NodoLista l) {
		if (l != null) {
			System.out.println(l.getDato());
			mostrarREC(l.getSig());
		}
	}

	@Override
	public void mostrarInversoREC(NodoLista l) {
		if (l != null) {
			mostrarInversoREC(l.getSig());
			System.out.println(l.getDato());
		}
	}

	public int[] retornarInversoREC(NodoLista l, int cont) {
		int[] result = new int[this.size()];
		if (l != null) {
			retornarInversoREC(l.getSig(), cont++);
			result[cont] = l.getDato();
		}
		return result;
	}

	private int size() {
		int res = 0;
		while (this.getInicio().getSig() != null) {
			res++;
		}
		return res;
	}

	@Override
	public boolean existeDatoREC(NodoLista l, int n) {
		if (l != null) {
			if (l.getDato() == n)
				return true;
			else
				return existeDatoREC(l.getSig(), n);
		} else
			return false;
	}
}