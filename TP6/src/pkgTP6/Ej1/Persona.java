package pkgTP6.Ej1;

public class Persona {
    private int edad;
    private String nombre;
    Persona next;
    Persona ant;

    public Persona(int e,String n){
        this.edad=e;
        this.nombre=n;
        this.next=null;
        this.ant=null;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSiguiente(Persona siguiente) {
        this.next = siguiente;
    }

    public Persona getSiguiente() {
        return this.next;
    }

}
