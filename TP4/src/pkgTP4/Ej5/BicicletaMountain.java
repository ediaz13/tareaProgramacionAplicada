package pkgTP4.Ej5;

public class BicicletaMountain extends Bicicleta {
    private int capacAmortiguacion;

    public BicicletaMountain(String color, int pesoCuadro, int capacAmortiguacion) {
        super(color, pesoCuadro);
        this.capacAmortiguacion = capacAmortiguacion;
    }

    public int getCapacAmortiguacion() {
        return capacAmortiguacion;
    }

    public void setCapacAmortiguacion(int capacAmortiguacion) {
        this.capacAmortiguacion = capacAmortiguacion;
    }

    public String getMarcha() {
        return "Media";
    }
}
