package pkgTP5.Ej2;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
import java.util.Stack;

public class MainStack {

    public static void main(String[] args) {
        Scanner en=new Scanner(System.in);
        Stack<Producto> pila = new Stack<Producto>();
        System.out.println("Ingrese cantidad de elementos:");
        Producto prod;

        int N=en.nextInt();

        for(int i=0; i<N; i++){
            int idProd = 0;
            String nameProd = StringUtils.SPACE;

            System.out.println("Ingrese idProducto: ");
            idProd = en.nextInt();
            System.out.println("Ingrese nombreProducto: ");
            nameProd = en.next();

            prod = new Producto(idProd, nameProd);

            pila.push(prod);
        }
        while(!pila.isEmpty()){
            prod = pila.pop();
            System.out.println(prod.getIdProducto() + StringUtils.SPACE + prod.getNombreProducto());
        }
    }

}
