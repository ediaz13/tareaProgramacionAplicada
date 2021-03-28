package pkgImperativos.ej1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valor1 = 0;
        int valor2=0;
        //Se crea el lector
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese primer valor: ");
        valor1 = sc.nextInt();
        System.out.println("Ingrese segundo valor: ");
        valor2=sc.nextInt();

        if(valor1>valor2) {
            System.out.println("El mayor es : " + valor1);

        } else if (valor1<valor2) {
            System.out.println("El mayor es : "  + valor2);
        } else {
            System.out.println("Los valores ingresados son iguales");

        }
    }
}
