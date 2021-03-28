package pkgImperativos.ej10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();

        cargaPalabras(palabras);
        cargaNumeros(numeros);
        muestraPalabras(palabras);
        muestraNumeros(numeros);
    }

    public static void cargaPalabras (ArrayList palabras)
    {
        for(int i=0;i<5;i++) {
            Scanner sc = new Scanner(System.in); //Se crea el lector
            System.out.println("Ingrese palabra: ");
            palabras.add(sc.nextLine());
        }
    }

    public static void cargaNumeros (ArrayList numeros)
    {
        for(int i=0;i<5;i++) {
            Scanner sc = new Scanner(System.in); //Se crea el lector
            System.out.println("Ingrese numero: ");
            numeros.add(sc.nextInt());
        }
    }

    public static void muestraPalabras (ArrayList palabras)
    {
        for(int i=0;i<palabras.size();i++) {
            System.out.println(palabras.get(i));
        }
    }

    public static void muestraNumeros (ArrayList numeros)
    {
        for(int i=0;i<numeros.size();i++) {
            System.out.println(numeros.get(i));
        }

        //Numeros.forEach((a)->System.out.println(a));

    }
}
