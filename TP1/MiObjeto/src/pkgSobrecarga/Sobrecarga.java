package pkgSobrecarga;

public class Sobrecarga {
    private int edad;
    private String nombre;
    private String direccion;


    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }


    public void SetData(int ed)
    {
        this.edad=ed;
    }
    public void SetData(int ed, String nom)
    {
        this.edad=ed;
        this.nombre=nom;
    }
    public void SetData(int ed, String nom, String dir)
    {
        this.edad=ed;
        this.nombre=nom;
        this.direccion=dir;
    }

}
