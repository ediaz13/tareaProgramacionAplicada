package Ej6;

public class NodoCola {
    private String dato;
    private NodoCola next;

    public NodoCola(String dato){
        this.dato=dato;
    }
    public String getDato() {
        return dato;
    }
    public void setDato(String dato) {
        this.dato = dato;
    }
    public NodoCola getNext() {
        return next;
    }
    public void setNext(NodoCola next) {
        this.next = next;
    }

}
