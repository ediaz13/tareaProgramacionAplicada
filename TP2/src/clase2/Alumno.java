package clase2;

import java.util.Date;

public class Alumno extends Persona {

    private int materiasAprobadas;
    private Date fechaIngreso;

    public int getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(int materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Alumno() {
    }

    public Alumno(String _nombre, String _dni, Date _fechaNac, int _materias, Date _fechaIngreso){
        super(_nombre,_dni,_fechaNac);
        this.materiasAprobadas = _materias;
        this.fechaIngreso = _fechaIngreso;
    }

    public void SetMateriasAprobadas(int _materiasAprobadas){
        this.materiasAprobadas=_materiasAprobadas;
    }
    public int GetMateriasAprobadas(){
        return this.materiasAprobadas;
    }
    public void SetFechaIngreso(Date _fechaIngreso){
        this.fechaIngreso=_fechaIngreso;
    }
    public Date GetFechaIngreso(){
        return this.fechaIngreso;
    }

}
