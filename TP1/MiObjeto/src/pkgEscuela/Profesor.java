package pkgEscuela;

import java.util.Date;

public class Profesor extends Persona {
    private int materiasCargo;
    private Date fechaAlta;

    public Profesor(String _nombre, String _dni, Date _fechaNac, int _materias, Date _fechaAlta){
        super(_nombre,_dni,_fechaNac);
        this.materiasCargo = _materias;
        this.fechaAlta = _fechaAlta;
    }
    public void SetMateriasCargo(int _materiasCargo){
        this.materiasCargo=_materiasCargo;
    }
    public int GetMateriasCargo(){
        return this.materiasCargo;
    }
    public void SetFechaAlta(Date _fechaAlta){
        this.fechaAlta=_fechaAlta;
    }
    public Date GetFechaAlta(){
        return this.fechaAlta;
    }

}
