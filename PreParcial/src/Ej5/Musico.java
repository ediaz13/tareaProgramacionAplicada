package Ej5;

public class Musico extends Instrumento  implements Accion {
    private String nombre;
    private String instrumento;
    private String cancion;

    public Musico(String nombre, String instrumento) {
        super(instrumento);
        this.nombre = nombre;
    }

    @Override
    public void Tocar(String cancion) {
        this.cancion = cancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }
}
