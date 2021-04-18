package pkgTP4.Ej3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPilaArrayList {
    public static void main(String[] args) {
        PilaEstArrListNombres nombresPila = new PilaEstArrListNombres();

        String nombre;

        Scanner sc=new Scanner(System.in);

        for (int i=0;i<5;i++)
        {
            System.out.println("Ingrese el nombre de la persona: ");
            nombre = sc.next();

            nombresPila.insertar(nombre);
        }
        while(!nombresPila.PilaVacia()){
            System.out.println(nombresPila.sacar());
        }
    }
}
