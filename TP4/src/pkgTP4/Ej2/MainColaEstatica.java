package pkgTP4.Ej2;

import java.util.Scanner;

public class MainColaEstatica {
    public static void main(String[] args) {
        ColaEstArrListPersona c = new ColaEstArrListPersona();

        Persona persona = new Persona();
        int edad;
        String nombre;

        Scanner sc=new Scanner(System.in);

        for (int i=0;i<5;i++)
        {
            System.out.println("Ingrese edad de la persona: ");
            edad = sc.nextInt();
            System.out.println("Ingrese edad de la persona: ");
            nombre = sc.next();

            persona.setEdad(edad);
            persona.setNombre(nombre);

            c.insertar(persona);
        }
        while(!c.ColaVacia()){
            System.out.println(c.sacar());
        }

    }
}
