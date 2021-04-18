package pkgTP5.Ej1;

public class MedicoGastroenterologo extends Medico {
    private String espGastro;

    public MedicoGastroenterologo(int edad, String nombre, String espGastro) {
        super(edad, nombre);
        this.espGastro = espGastro;
    }

    public String getEspGastro() {
        return espGastro;
    }

    public void setEspGastro(String espGastro) {
        this.espGastro = espGastro;
    }
}
