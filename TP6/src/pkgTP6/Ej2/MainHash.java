package pkgTP6.Ej2;

import java.util.Scanner;

public class MainHash {
    public static void main(String[] args) {
        int[] Elementos=new int[6];//{40,13,10,32,20};

        Scanner sc = new Scanner(System.in); //Se crea el lector
        for(int i=0;i<6;i++){
            System.out.println("Ingrese valor: "+ (i+1));
            Elementos[i] = sc.nextInt();
        }

        Hashtable Hash=new Hashtable(Elementos.length*2);
        Hash.funcionHash(Elementos, Hash.TablaHash);

        System.out.println("Ingrese valor a buscar: ");
        int buscado=Hash.BuscarClave(sc.nextInt());

        System.out.println();
        for(int i=0;i<Hash.tamanio;i++){
            System.out.println("Ingrese valor a buscar: " +Hash.TablaHash[i] );
        }


    }
}
