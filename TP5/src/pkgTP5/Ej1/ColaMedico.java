package pkgTP5.Ej1;
public class ColaMedico {
    private Medico primero;
    private Medico ultimo;
    private int tamanio;

    public ColaMedico() {
        primero = null;
        ultimo = null;
        tamanio = 0;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        return tamanio;
    }

    public Medico primero() {

        if (isEmpty()) {
            return null;
        }

        return primero;
    }

    public void insertar(Medico medico){
        if(primero==null && ultimo==null){
            primero=medico;
            ultimo=medico;
        }
        ultimo.setSiguiente(medico);
        ultimo = ultimo.getSiguiente();
    }


    public Medico extraer(){
        Medico p = primero;
        primero = primero.getSiguiente();
        return p;
    }

    public boolean estaVacia(){
        boolean vacia;
        if(primero==null){
            vacia=true;
        }
        else{
            vacia=false;
        }
        return vacia;
    }

}

