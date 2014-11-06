package modelo;

public interface EstructuraArbol<T> {
	public boolean vacia();
	public void insertar(T dato);
	public void eliminar(T dato);
	public T getRaiz();
	public T getHijo(int i);
}
