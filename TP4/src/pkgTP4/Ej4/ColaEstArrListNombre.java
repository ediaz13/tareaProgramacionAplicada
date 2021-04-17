package pkgTP4.Ej4;

import pkgTP4.Ej2.Persona;

import java.util.ArrayList;

public class ColaEstArrListNombre {
    ArrayList<String> cola1 = new ArrayList<String>();
    int inicio=-1;
    int fin=-1;

    public void insertar(String v){
        fin++;
        if(fin==0){
            inicio++;
        }
        cola1.add(v);
    }
    public String sacar(){
        String ret;
        ret=cola1.remove(inicio);
        return ret;
    }

    public boolean ColaVacia(){
        return cola1.size() == 0;
    }

}
