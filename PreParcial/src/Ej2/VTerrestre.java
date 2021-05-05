package Ej2;

public class VTerrestre extends Vehiculo {
    private String marca;
    private String modelo;


    public VTerrestre(String marca, String modelo, String color, int velocidad) {
        super(color, velocidad);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getTerreno() {
        return "Terrestre";
    }
}
