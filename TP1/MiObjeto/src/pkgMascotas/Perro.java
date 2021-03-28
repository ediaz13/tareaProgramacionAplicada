package pkgMascotas;

public class Perro extends Mascota {
    public Perro(String nom, String col, String ra){
        super(nom,col,ra);
        this.animal="Perro";
    }

    @Override
    public String GetAccion(){
        this.accion = "Ladrar";
        return this.accion;
    }

}
