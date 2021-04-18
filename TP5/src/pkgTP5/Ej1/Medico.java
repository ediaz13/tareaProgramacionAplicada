package pkgTP5.Ej1;

public abstract class Medico {
    private int edad;
    private String nombre;

    private Medico siguiente;

    public Medico(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Medico getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Medico siguiente) {
        this.siguiente = siguiente;
    }
}
