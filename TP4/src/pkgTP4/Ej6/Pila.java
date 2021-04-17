package pkgTP4.Ej6;

public class Pila {
    private Persona tope;

    public Pila(){
        tope=null;
    }

    public void Poner(int e, String n){
        tope=new Persona(e,n,tope);
    }

    public Persona Sacar(){
        Persona p;
        Persona aux;
        aux=this.tope;

        if(aux==null)
            return null;

        p=aux;
        tope=aux.getSiguiente();

        aux=null;
        return p;
    }

    public boolean EstaVacia(){
        return this.tope==null;
    }

    public void Vaciar()
    {
        Persona aux;

        while(tope!=null){
            aux=this.tope;
            tope=aux.getSiguiente();
            aux=null;
        }
    }

}
