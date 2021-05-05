package Ej6;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> cancionesDivididos = new HashMap<Integer, String>();

        ColaDinamica colaDin =new ColaDinamica();
        PilaDinamica pilaDin = new PilaDinamica();

        cancionesDivididos.put(1, "Narigon del siglo");
        cancionesDivididos.put(2, "Gol de mujer");
        cancionesDivididos.put(3, "Volver ni a palos");
        cancionesDivididos.put(4, "Buscando un angel");
        cancionesDivididos.put(5, "Hombre en U");
        cancionesDivididos.put(6, "El burrito");
        cancionesDivididos.put(7, "A la delta");
        cancionesDivididos.put(8, "Cajita musical");
        cancionesDivididos.put(9, "Alma de budín");
        cancionesDivididos.put(10, "Paisano de Hurlingham");

        for (int i = 1; i <= 10; i++) {
            if (i < 6 ) {
                pilaDin.Poner(cancionesDivididos.get(i));
            } else {
                colaDin.insertar(cancionesDivididos.get(i));
            }
        }

        System.out.println("Los menores de 6: ");
        while (!pilaDin.EstaVacia()) {
            System.out.println(pilaDin.Sacar());
        }
        System.out.println("//////////////////////");

        System.out.println("Los restantes: ");
        while (!colaDin.estaVacia()) {
            System.out.println(colaDin.extraer());
        }

    }
}
