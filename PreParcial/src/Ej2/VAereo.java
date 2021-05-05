package Ej2;

public class VAereo extends Vehiculo {
    private String tipoModelo;
    private String turbina;


    public VAereo(String modelo, String turbina, String color, int velocidad) {
        super(color, velocidad);
        this.tipoModelo = modelo;
        this.turbina = turbina;
    }

    public String getTipoModelo() {
        return tipoModelo;
    }

    public void setTipoModelo(String tipoModelo) {
        this.tipoModelo = tipoModelo;
    }

    public String getTurbina() {
        return turbina;
    }

    public void setTurbina(String turbina) {
        this.turbina = turbina;
    }

    @Override
    public String getTerreno() {
        return "Aereo";
    }
}
