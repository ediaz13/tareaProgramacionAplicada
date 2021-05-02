package pkgTP6.Ej1;

public class ListaDoblementeEnlazada {
    Persona primero;
    Persona ultimo;
    ListaDoblementeEnlazada()
    {
        primero=null;
        ultimo=null;
    }

    public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }

    public ListaDoblementeEnlazada Alta(int ed, String nom)
    {
        if(estavacio())
        {
            Persona nuevo=new Persona(ed,nom);
            primero=nuevo;
            ultimo=nuevo;
        }
        else
        {
            Persona nuevo=new Persona(ed,nom);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
        return this;
    }

    public boolean Baja(String nom)
    {
        Persona anterior=null;
        Persona actual=primero;
        while(actual!=ultimo)
        {
            if(actual.getNombre()==nom)
            {
                if(anterior==null)
                {
                    primero=actual.next;
                    primero.ant=null;
                }
                else{
                    anterior.next=actual.next;
                    Persona temporal;
                    temporal=actual.next;
                    temporal.ant=anterior;
                }
                return true;
            }
            anterior=actual;
            actual=actual.next;
        }
        if(nom==ultimo.getNombre())
        {
            ultimo=actual.ant;
            return true;
        }
        return false;
    }

    public void ImpresionAdelante()
    {
        Persona actual;
        actual=ultimo;
        while(actual!=primero)
        {
            System.out.println("Nombre--> "+actual.getNombre()+" Edad--> "+actual.getEdad());
            actual=actual.ant;
        }
        System.out.println("Nombre--> "+actual.getNombre()+" Edad--> "+actual.getEdad());

    }
    public void ImpresionAtras()
    {
        Persona actual;
        actual=primero;
        while(actual!=ultimo)
        {
            System.out.println("Nombre--> "+actual.getNombre()+" Edad--> "+actual.getEdad());
            actual=actual.next;
        }
        System.out.println("Nombre--> "+actual.getNombre()+" Edad--> "+actual.getEdad());
    }

}
