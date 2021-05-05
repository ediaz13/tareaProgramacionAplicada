package Ej6;

public class Nodo {
    private String valor;
    private Nodo siguiente;

    public Nodo(String v, Nodo s){
        this.valor=v;
        this.siguiente=s;
    }


    public String getValor() {
        return valor;
    }


    public void setValor(String valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
