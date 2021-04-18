package pkgTP4.Ej5;

public abstract class Bicicleta {

    private String color;
    private int pesoCuadro;
    private Bicicleta siguiente;

    public Bicicleta(String color, int pesoCuadro) {
        this.color = color;
        this.pesoCuadro = pesoCuadro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPesoCuadro() {
        return pesoCuadro;
    }

    public void setPesoCuadro(int pesoCuadro) {
        this.pesoCuadro = pesoCuadro;
    }

    public Bicicleta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Bicicleta siguiente) {
        this.siguiente = siguiente;
    }
}
