package pkgTP4.Ej2;

import java.util.ArrayList;

public class ColaEstArrListPersona {
    ArrayList<Persona> cola1 = new ArrayList<Persona>();
    int inicio=-1;
    int fin=-1;

    public void insertar(Persona v){
        fin++;
        if(fin==0){
            inicio++;
        }
        cola1.add(v);
    }
    public Persona sacar(){
        Persona ret;
        ret=cola1.remove(inicio);
        return ret;
    }

    public boolean ColaVacia(){
        return cola1.size() == 0;
    }

}
