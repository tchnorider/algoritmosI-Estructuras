package listaDoble;

public interface IListaD {
	
	void insertarInicio(int valor);
	
	boolean esVacia();
	
	void imprimir();
	
	boolean existe(int valor);
	
	void borrarInicio();
	
	void borrar(int valor);
	
	void vaciarLista();

	NodoLD buscarElemento(int valor);
}
