package Ej6;

public class PilaDinamica {
    private Nodo tope;

    public PilaDinamica(){
        tope=null;
    }

    public void Poner(String v){
        tope=new Nodo(v,tope);
    }

    public String Sacar(){
        Nodo aux;
        String Info;

        aux=this.tope;

        if(aux==null)
            return " ";

        tope=aux.getSiguiente();
        Info=aux.getValor();

        aux=null;
        return Info;
    }

    public boolean EstaVacia(){
        return this.tope==null;
    }

    public void Vaciar()
    {
        Nodo aux;

        while(tope!=null){
            aux=this.tope;
            tope=aux.getSiguiente();
            aux=null;
        }
    }

}
