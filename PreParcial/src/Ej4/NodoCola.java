package Ej4;

public class NodoCola {
    private int dato;
    private NodoCola next;

    public NodoCola(int dato){
        this.dato=dato;
    }
    public int getDato() {
        return dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }
    public NodoCola getNext() {
        return next;
    }
    public void setNext(NodoCola next) {
        this.next = next;
    }

}
