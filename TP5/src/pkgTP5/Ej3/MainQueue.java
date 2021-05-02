package pkgTP5.Ej3;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
        Queue<Producto> cola = new LinkedList<Producto>();

        Scanner en=new Scanner(System.in);
        Producto pro; //pro -> variable de tipo Producto
        System.out.print("Inserte cantidad de datos a insertar:");
        int N=en.nextInt(); //cantidad de datos por teclado

        for(int i=0; i<N; i++){
            System.out.println("Ingrese nombre producto: ");
            String nom=en.next();

            System.out.println("Ingrese codigo producto: ");
            int cod=en.nextInt();

            pro=new Producto(cod, nom);
            cola.add(pro); //se inserta el producto en la cola
        }

        while (!cola.isEmpty()) {
            pro = cola.remove();
            System.out.println(pro.getIdProducto() + StringUtils.SPACE + pro.getNombreProducto());
        }

    }

}
