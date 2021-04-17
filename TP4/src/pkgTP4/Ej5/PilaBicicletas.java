package pkgTP4.Ej5;

public class PilaBicicletas {
    private BicicletaPracticar tope;

    public PilaBicicletas(){
        tope=null;
    }

    public void Poner(String tipo){
        tope=new BicicletaPracticar(tipo,tope);
    }

    public String Sacar(){
        BicicletaPracticar aux;
        String Info;

        aux=this.tope;

        if(aux==null)
            return null;

        tope=aux.getSiguiente();
        Info=aux.getTipo();

        aux=null;
        return Info;
    }

    public boolean EstaVacia(){
        return this.tope==null;
    }

    public void Vaciar()
    {
        BicicletaPracticar aux;

        while(tope!=null){
            aux=this.tope;
            tope=aux.getSiguiente();
            aux=null;
        }
    }

}
