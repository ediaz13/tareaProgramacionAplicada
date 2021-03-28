package pkgMiNombre;

import java.util.Scanner;

public class MiNombre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Se crea el lector
        System.out.println("Por favor ingrese su nombre: ");//Se pide un dato al usuario
        String nombre = sc.nextLine(); //Se lee el nombre con nextLine() que retorna un String con el dato
        System.out.println("Bienvenido " + nombre + ". \nPor favor ingrese su edad");//Se pide otro dato al usuario

        int edad = sc.nextInt();
        System.out.println("Su edad es: " + edad);//Se pide otro dato al usuario


    }
}
