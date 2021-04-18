package pkgTP5.Ej1;

public class MedicoClinico extends Medico {
    private String espClinico;

    public MedicoClinico(int edad, String nombre, String especialidad) {
        super(edad, nombre);
        this.espClinico = especialidad;
    }

    public String getEspClinico() {
        return espClinico;
    }

    public void setEspClinico(String espClinico) {
        this.espClinico = espClinico;
    }
}
