package pkgTP4.Ej5;

public class BicicletaPaseo extends Bicicleta {
    private int capacCanasta;

    public BicicletaPaseo(String color, int pesoCuadro, int capacCanasta) {
        super(color, pesoCuadro);
        this.capacCanasta = capacCanasta;
    }

    public int getCapacCanasta() {
        return capacCanasta;
    }

    public void setCapacCanasta(int capacCanasta) {
        this.capacCanasta = capacCanasta;
    }

    public String getMarcha() {
        return "Lenta";
    }

}
