package pkgImperativos.ej8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int valor1,valor2,vueltas=0;
            Scanner sc = new Scanner(System.in); //Se crea el lector
            System.out.println("Ingrese primer valor: ");
            valor1=sc.nextInt();

            System.out.println("Ingrese cuantas veces incrementarlo: ");
            valor2=sc.nextInt();

            while(vueltas<valor2)
            {
                valor1 = incremento(valor1);

                vueltas++;
            }
            System.out.println("Primer valor incrementado: " + valor1);
    }

    public static int incremento(int val) {
        return ++val;
    }
}
