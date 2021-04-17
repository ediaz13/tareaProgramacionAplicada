package pkgTP4.Ej6;

public class Persona {
    private int edad;
    private String nombre;
    private Persona siguiente;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona getSiguiente() {
        return siguiente;
    }

    public Persona(int e, String n, Persona p){
        this.edad=e;
        this.nombre=n;
        this.siguiente=p;
    }

}
