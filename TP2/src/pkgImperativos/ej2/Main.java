package pkgImperativos.ej2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valor1=0,valor2=0;
        Scanner sc = new Scanner(System.in); //Se crea el lector
        System.out.println("Ingrese primer valor: ");
        valor1=sc.nextInt();
        System.out.println("Ingrese segundo valor: ");
        valor2=sc.nextInt();

        if((valor1>10)&&(valor2>10)) {
            System.out.println("Ambos valores superan 10");
        } else {
            System.out.println("Alguno o ambos valores no superan 10");
        }
    }

}
