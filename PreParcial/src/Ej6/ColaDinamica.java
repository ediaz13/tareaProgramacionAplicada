package Ej6;

public class ColaDinamica {
    private NodoCola inicio;
    private NodoCola termino;

    public ColaDinamica(){
        inicio=null;
        termino=null;
    }
    public void insertar(String dato){
        NodoCola i=new NodoCola(dato);
        if(inicio==null && termino==null){
            inicio=i;
            termino=i;
        }
        termino.setNext(i);
        termino = termino.getNext();
    }

    public String extraer(){
        String dato = inicio.getDato();
        inicio = inicio.getNext();
        return dato;
    }
    public boolean estaVacia(){
        boolean vacia;
        if(inicio==null){
            vacia=true;
        }
        else{
            vacia=false;
        }
        return vacia;
    }

}
