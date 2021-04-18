package pkgTP4.Ej5;

public class PilaBicicletas {
    private Bicicleta tope;

    public PilaBicicletas(){
        tope=null;
    }

    public void Poner(Bicicleta bici){
        bici.setSiguiente(tope);
        tope= bici;
    }

    public Bicicleta Sacar(){
        Bicicleta pilaBici;
        Bicicleta aux;
        aux=this.tope;

        if(aux==null)
            return null;

        pilaBici = aux;
        tope=aux.getSiguiente();

        aux=null;
        return pilaBici;
    }

    public boolean EstaVacia(){
        return this.tope==null;
    }

    public void Vaciar() {
        Bicicleta aux;

        while(tope!=null){
            aux = this.tope;
            tope = aux.getSiguiente();
            aux = null;
        }
    }

}
