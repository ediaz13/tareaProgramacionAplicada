package Ej4;

public class Nodo {
    private int valor;
    private Nodo siguiente;

    public Nodo(int v, Nodo s){
        this.valor=v;
        this.siguiente=s;
    }


    public int getValor() {
        return valor;
    }


    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
