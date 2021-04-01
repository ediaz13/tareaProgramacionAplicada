package pkgTP3.Ej1;

public abstract class Reproductor {
    private String cancion;
    protected int volumen;
    protected String idioma;
    protected int salidaAV;

	/*//Habilitar despues de modificar el main
	public Reproductor(String _cancion){
		this.cancion = _cancion;
	}*/

    public Reproductor(String cancion, int volumen, String idioma, int salidaAV) {
        this.cancion = cancion;
        this.volumen = volumen;
        this.idioma = idioma;
        this.salidaAV = salidaAV;
    }

    public Reproductor() {

    }

    public String getCancion() {
        return cancion;
    }
    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public abstract String getTipo();

}
