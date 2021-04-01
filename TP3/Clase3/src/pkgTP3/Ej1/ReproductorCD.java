package pkgTP3.Ej1;

public class ReproductorCD extends Reproductor implements Menu {

    String tipoBateria;

    public ReproductorCD(String cancion, int volumen, String idioma, int salidaAV, String tipoBateria) {
        super(cancion, volumen, idioma, salidaAV);
        this.tipoBateria = tipoBateria;
    }

    public ReproductorCD(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    @Override
    public void ChangeIdioma(String id) {

    }

    @Override
    public void ChangeVolume(int vol) {

    }

    @Override
    public void ChangeOutPutAV(int output) {

    }

    @Override
    public String getTipo() {
        return null;
    }
}
