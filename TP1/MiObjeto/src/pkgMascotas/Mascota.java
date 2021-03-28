package pkgMascotas;

public abstract class Mascota {
    protected String animal;
    private String nombre;
    private String color;
    private String raza;
    protected  String accion;

    public Mascota(String nom, String col, String ra){
        this.nombre=nom;
        this.color=col;
        this.raza=ra;
    }

    public String GetAnimal(){
        return this.animal;
    }
    public String GetNombre(){
        return this.nombre;
    }
    public String GetColor(){
        return this.color;
    }
    public String GetRaza(){
        return this.raza;
    }
    public abstract String GetAccion();

}
