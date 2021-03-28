package pkgImperativos.ej9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valor,vueltas=0;

        Scanner sc = new Scanner(System.in); //Se crea el lector
        System.out.println("Ingrese valor: ");
        valor=sc.nextInt();

        if(valor%2==0) {
            for(int i=0;i<10;i++) {
                ++valor;
            }
        } else {
            while(vueltas<5) {
                --valor;
                ++vueltas;
            }
        }

        System.out.println("Valor: "+valor);

    }
}
