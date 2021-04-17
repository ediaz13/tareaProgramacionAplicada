package pkgTP4.Ej1;

import java.util.ArrayList;

public class PilaEstArrListPersona {
    ArrayList<Persona> pila1 = new ArrayList<Persona>();
    int tope=-1;

    public void insertar(Persona v){
        pila1.add(v);
        tope++;
    }
    public Persona sacar(){
        Persona ret;
        ret = pila1.remove(tope);
        tope--;
        return ret;
    }
    public boolean PilaVacia(){
        return tope==-1;
    }
    public boolean PilaLlena(){
        return tope==pila1.size()-1;
    }


}
