package Ej5;

public class Ejecucion {
    public static void main(String[] args) {
        Accion c = new Musico("Ricardo Mollo","Guitarra");
        c.Tocar("Amapola del 66");

        System.out.println(((Musico)c).getNombre() +", "+((Musico)c).getInstrumento()+", "+((Musico)c).getCancion());

    }

}

