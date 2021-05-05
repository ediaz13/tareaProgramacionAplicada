package Ej2;

public abstract class Vehiculo {
    private String color;
    private int velocidadMax;
    private String terreno;

    public Vehiculo(String color, int velocidad) {
        this.color = color;
        this.velocidadMax = velocidad;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidad) {
        this.velocidadMax = velocidad;
    }

//    public String getTerreno() {
//        return terreno;
//    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public abstract String getTerreno();
}
