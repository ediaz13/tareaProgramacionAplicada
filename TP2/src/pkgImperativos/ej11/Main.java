package pkgImperativos.ej11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Empleados = new ArrayList<>();
        ArrayList<Float> Sueldos = new ArrayList<>();

        CargaDatos(Empleados,Sueldos);
        MuestraDatos(Empleados,Sueldos);
    }

    public static void CargaDatos(ArrayList Empleados,ArrayList Sueldos)
    {
        for(int i=0;i<5;i++) {
            Scanner sc = new Scanner(System.in); //Se crea el lector
            System.out.println("Empleado: ");
            Empleados.add(sc.nextLine());

            System.out.println("Sueldo: ");
            Sueldos.add(sc.nextFloat());
        }
    }

    public static void MuestraDatos(ArrayList Empleados,ArrayList Sueldos)
    {
        for(int i=0;i<Empleados.size();i++) {
            System.out.println("Empleado: "+Empleados.get(i) + " Sueldo:" + Sueldos.get(i));
        }

    }
}
