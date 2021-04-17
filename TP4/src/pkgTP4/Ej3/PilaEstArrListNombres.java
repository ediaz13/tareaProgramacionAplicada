package pkgTP4.Ej3;

import pkgTP4.Ej1.Persona;

import java.util.ArrayList;

public class PilaEstArrListNombres {
    ArrayList<String> pila1 = new ArrayList<String>();
    int tope=-1;

    public void insertar(String v){
        pila1.add(v);
        tope++;
    }
    public String sacar(){
        String ret;
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
