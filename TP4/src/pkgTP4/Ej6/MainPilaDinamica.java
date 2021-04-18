package pkgTP4.Ej6;

import java.util.Scanner;

public class MainPilaDinamica {
    public static void main(String[] args) {
        Pila pila = new Pila();
        int edad;
        String nombre;

        Scanner sc = new Scanner(System.in); //Se crea el lector
        System.out.println("Ingrese Edad: ");
        edad = sc.nextInt();
        while(edad !=0){
            System.out.println("Ingrese Nombre: ");
            nombre = sc.next();
            pila.Poner(edad,nombre);

            System.out.println("Ingrese Edad: ");
            edad = sc.nextInt();
        }

        while(!pila.EstaVacia())
        {
            Persona p = pila.Sacar();
            System.out.println(p.getNombre()+" "+p.getEdad());
        }


    }
}
