package pkgImperativos.ej7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] listaNumeros = new int[6];

        CargarVector(listaNumeros);
        MostrarVector(listaNumeros);
    }

    public static void CargarVector(int[] listaNum) {
        Scanner sc = new Scanner(System.in); //Se crea el lector
        for (int i=0; i<listaNum.length; i++) {
            System.out.println("Ingrese un nro: ");
            listaNum[i]=sc.nextInt();
        }
    }

    public static void MostrarVector(int[] listaNum) {
        System.out.println("Vector: ");
        for (int i=0; i<listaNum.length; i++) {
            System.out.println(listaNum[i]);
        }

    }
}
