package Ej3;

public class Nodo {
    private int valor;
    private Nodo siguiente;

    public Nodo(int v){
        this.valor=v;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
