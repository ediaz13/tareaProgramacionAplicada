package pkgMascotas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

        Mascota objPerro=new Perro("natal","negro","pp");
        Mascota objGato=new Gato("chatran","blanco con rayas naranjas","angora");
        Mascota objCanario=new Canario("tweetty","amarillo","roller");

        mascotas.add(objPerro);
        mascotas.add(objGato);
        mascotas.add(objCanario);

        for (Mascota m : mascotas) {
            System.out.print("Animal: " + m.GetAnimal()+"\n");
            System.out.print("Nombre: " + m.GetNombre()+"\n");
            System.out.print("Color: " + m.GetColor()+"\n");
            System.out.print("Raza: " + m.GetRaza()+"\n");
            System.out.print("Accion: " + m.GetAccion()+"\n\n");
        }
    }

}

