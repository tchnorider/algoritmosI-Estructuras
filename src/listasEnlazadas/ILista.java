package listasEnlazadas;

public interface ILista {

	// PRE:
	// POS: Retorna true si la lista no tiene nodos
	public abstract boolean esVacia();

	// PRE:
	// POS: Agrega un nuevo Nodo al principio de la lista
	public abstract void agregarInicio(int n);

	// PRE:
	// POS: Agrega un nuevo Nodo al final de la lista
	public abstract void agregarFinal(int n);

	// PRE:
	// POS: Borra el primer nodo
	public abstract void borrarInicio();

	// PRE:
	// POS: Borra el último nodo

	public abstract void borrarFin();

	// PRE:
	// POS: elimina todos los nodos de una lista dada
	public abstract void vaciar();

	// PRE:
	// POS: Recorre y muestra los datos de lista
	public abstract void mostrar();

	// PRE: lista ordenada => mantiena orden
	// POS: inserta nuevo elemento en orden ascendente
	public abstract void agregarOrd(int n);

	// PRE: lista ordenada
	// POS: Borra la primer ocurrencia de un elemento dado
	public abstract void borrarElemento(int n);

	// PRE:
	// POS: Retorna la cantidad de nodos que tiene la lista
	public abstract int cantElementos();

	// PRE:
	// POS:
	public abstract NodoLista obtenerElemento(int n);

	/***** Metodos y funciones RECURSIVAS *****/

	// PRE:
	// POS: muestra los datos de la lista en orden de enlace
	public abstract void mostrarREC(NodoLista l);

	// PRE:
	// POS: muestra los datos de la lista en orden inverso
	public abstract void mostrarInversoREC(NodoLista l);

	// PRE:
	// POS: retorna true si el elemento pertenece a la lista
	public abstract boolean existeDatoREC(NodoLista l, int n);

}