package pkgTP4.Ej4;

import pkgTP4.Ej2.ColaEstArrListPersona;
import pkgTP4.Ej2.Persona;

import java.util.Scanner;

public class MainColaArrayList {
    public static void main(String[] args) {
        ColaEstArrListNombre colaNombres = new ColaEstArrListNombre();
        String nombre;

        Scanner sc=new Scanner(System.in);

        for (int i=0;i<5;i++)
        {
            System.out.println("Ingrese nombre de la persona: ");
            nombre = sc.next();

            colaNombres.insertar(nombre);
        }
        while(!colaNombres.ColaVacia()){
            System.out.println(colaNombres.sacar());
        }

    }
}
