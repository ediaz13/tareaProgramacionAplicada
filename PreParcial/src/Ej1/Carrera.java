package Ej1;

public class Carrera extends Universidad {
    private String carrera;
    private int cuatrimestres;
    private String orientacion;

    public Carrera(String universidad, String carrera, int cuatrimestre, String orientacion) {
        super(universidad);
        this.carrera = carrera;
        this.cuatrimestres = cuatrimestre;
        this.orientacion = orientacion;

    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCuatrimestres() {
        return cuatrimestres;
    }

    public void setCuatrimestres(int cuatrimestre) {
        this.cuatrimestres = cuatrimestre;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }
}
