package pkgMiObjeto;

public class ClaseValor {

    private int valor;

    //Constructor por defecto
    public ClaseValor(){
        this.valor=0;
    }
    //Constructor por parametro
    public ClaseValor(int _val){
        this.valor=_val;
    }
    //Constructor de copia
    public ClaseValor(ClaseValor _objCV){
        this.valor=_objCV.valor;
    }


    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
