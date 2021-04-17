package pkgTP4.Ej5;

public class BicicletaPracticar {

    private String tipo;
    private BicicletaPracticar siguiente;

    public BicicletaPracticar(String tipo, BicicletaPracticar siguiente) {
        this.tipo = tipo;
        this.siguiente = siguiente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BicicletaPracticar getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(BicicletaPracticar siguiente) {
        this.siguiente = siguiente;
    }
}
