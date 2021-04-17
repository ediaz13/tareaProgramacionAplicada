package pkgTP4.Ej5;

public class Main {
    public static void main(String[] args) {
        PilaBicicletas pila = new PilaBicicletas();
        pila.Poner("carrera");
        pila.Poner("paseo");
        pila.Poner("mountainbike");

        while(!pila.EstaVacia()) {
            System.out.println(pila.Sacar());
        }
        pila.Poner("triciclo");
        pila.Poner("ruiditas");

        System.out.println(pila.EstaVacia());
        pila.Vaciar();
        System.out.println(pila.EstaVacia());

    }




}
