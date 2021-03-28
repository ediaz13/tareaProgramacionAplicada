package clase2;

import java.util.Date;

public class Persona {

    private String nombre;
    private String dni;
    private Date fechaNac;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Persona() {
    }

    public Persona(String _nombre, String _dni, Date _fechaNac){
        this.nombre = _nombre;
        this.dni = _dni;
        this.fechaNac = _fechaNac;
    }
    public void SetNombre(String _nombre){
        this.nombre=_nombre;
    }
    public String GetNombre(){
        return this.nombre;
    }
    public void SetDni(String _dni){
        this.dni=_dni;
    }
    public String GetDni(){
        return this.dni;
    }
    public void SetFechaNac(Date _fnac){
        this.fechaNac=_fnac;
    }
    public Date GetFechanac(){
        return this.fechaNac;
    }


}
