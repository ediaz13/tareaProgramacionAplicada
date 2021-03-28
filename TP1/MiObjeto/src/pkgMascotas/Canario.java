package pkgMascotas;

public class Canario extends Mascota {
    public Canario(String nom, String col, String ra)
    {
        super(nom,col,ra);
        this.animal="Canario";
    }

    @Override
    public String GetAccion(){
        this.accion = "Gorjear";
        return this.accion;
    }

}
