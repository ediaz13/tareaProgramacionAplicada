package pkgTP4.Ej5;

public class BicicletaCarrera extends Bicicleta {

    private int capacCantimplora;

    public BicicletaCarrera(String color, int pesoCuadro, int capacCantimplora) {
        super(color, pesoCuadro);
        this.capacCantimplora = capacCantimplora;
    }

    public int getCapacCantimplora() {
        return capacCantimplora;
    }

    public void setCapacCantimplora(int capacCantimplora) {
        this.capacCantimplora = capacCantimplora;
    }

    public String getMarcha() {
        return "Rapida";
    }
}
