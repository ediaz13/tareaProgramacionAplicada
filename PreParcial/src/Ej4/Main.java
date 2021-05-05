package Ej4;

import java.lang.reflect.Array;
import java.lang.reflect.Array;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ColaDinamica colaDin =new ColaDinamica();
        PilaDinamica pilaDin = new PilaDinamica();

        int[] myIntArray = new int[10];

        for (int i = 0; i < 10; i++) {
            //Random rand = new Random();
            myIntArray[i] = i;

        }

        for (int i = 0; i < 10; i++){
            if (myIntArray[i] % 2 == 0) {
                colaDin.insertar(myIntArray[i]);
            } else {
                pilaDin.Poner(myIntArray[i]);
            }
        }

        System.out.println("Los de la cola");
        while (!colaDin.estaVacia()) {
            System.out.println(colaDin.extraer());
        }

        System.out.println("Los de la pila");
        while (!pilaDin.EstaVacia()) {
            System.out.println(pilaDin.Sacar());
        }

    }
}
