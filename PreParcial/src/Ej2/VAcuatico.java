package Ej2;

public class VAcuatico extends Vehiculo {
    private String nombre;
    private String motor;


    public VAcuatico(String nombre, String motor, String color, int velocidad) {
        super(color, velocidad);
        this.nombre = nombre;
        this.motor = motor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String getTerreno() {
        return "Acuatico";
    }
}
