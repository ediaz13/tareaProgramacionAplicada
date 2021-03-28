package pkgMascotas;

public class Gato extends Mascota {
    public Gato(String nom, String col, String ra){
        super(nom,col,ra);
        this.animal="Gato";
    }

    @Override
    public String GetAccion(){
        this.accion = "Maullar";
        return this.accion;
    }

}
