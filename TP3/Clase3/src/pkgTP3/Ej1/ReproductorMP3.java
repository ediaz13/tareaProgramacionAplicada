package pkgTP3.Ej1;

public class ReproductorMP3 extends Reproductor implements Menu {

    String tiposArchivoLectura;

    public ReproductorMP3(String tiposArchivoLectura) {
        super();
        this.tiposArchivoLectura = tiposArchivoLectura;
    }

    public ReproductorMP3(String tomando_mate_en_la_paz, String s, int i, String español, int i1) {
        super();
    }

    public String getTiposArchivoLectura() {
        return tiposArchivoLectura;
    }

    public void setTiposArchivoLectura(String tiposArchivoLectura) {
        this.tiposArchivoLectura = tiposArchivoLectura;
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
