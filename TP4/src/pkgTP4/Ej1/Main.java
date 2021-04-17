package pkgTP4.Ej1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PilaEstArrListPersona p = new PilaEstArrListPersona();
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

            p.insertar(persona);
        }
        while(!p.PilaVacia()){
            System.out.println(p.sacar());
        }
    }


}
