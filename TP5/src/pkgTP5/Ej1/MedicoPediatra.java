package pkgTP5.Ej1;

public class MedicoPediatra extends Medico {
    private String espPediatra;

    public MedicoPediatra(int edad, String nombre, String espPediatra) {
        super(edad, nombre);
        this.espPediatra = espPediatra;
    }

    public String getEspPediatra() {
        return espPediatra;
    }

    public void setEspPediatra(String espPediatra) {
        this.espPediatra = espPediatra;
    }
}
