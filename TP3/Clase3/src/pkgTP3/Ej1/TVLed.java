package pkgTP3.Ej1;

public class TVLed implements Menu {
    int cantCanales;
    String idioma;
    int volumen;
    String salidaAV;

    public TVLed(int cantCanales, String idioma, int volumen, String salidaAV) {
        this.cantCanales = cantCanales;
        this.idioma = idioma;
        this.volumen = volumen;
        this.salidaAV = salidaAV;
    }

    public int getCantCanales() {
        return cantCanales;
    }

    public void setCantCanales(int cantCanales) {
        this.cantCanales = cantCanales;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getSalidaAV() {
        return salidaAV;
    }

    public void setSalidaAV(String salidaAV) {
        this.salidaAV = salidaAV;
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
}
