package Ej2;

import java.util.ArrayList;

public class ClaseEjecucion{
    public static void main(String []args){

        ArrayList<Vehiculo> vehic = new ArrayList<Vehiculo>();

        Vehiculo objAuto=new VTerrestre("Ford","Mustang","negro",240);
        Vehiculo objBarco=new VAcuatico("Libertad II","StringGray","blanco",35);
        Vehiculo objAvion=new VAereo("Boeing 747","Pratt & Whitney","azul",900);

        vehic.add(objAuto);
        vehic.add(objBarco);
        vehic.add(objAvion);

        for (Vehiculo v : vehic) {
            System.out.print("Color: " + v.getColor()+"\n");
            System.out.print("Vel Max: " + v.getVelocidadMax()+"\n");
            System.out.print("Terreno: " + v.getTerreno()+"\n");

            System.out.println(v.getClass().getName());
            if(v.getClass().getName() == "Ej2.VTerrestre"){
                System.out.print("Marca: " + ((VTerrestre)v).getMarca()+"\n");
                System.out.print("Modelo: " + ((VTerrestre)v).getModelo()+"\n");
            }

            if(v.getClass().getName()=="Ej2.VAcuatico"){
                System.out.print("Nombre: " + ((VAcuatico)v).getNombre()+"\n");
                System.out.print("Motor: " + ((VAcuatico)v).getMotor()+"\n");
            }

            if(v.getClass().getName()=="Ej2.VAereo"){
                System.out.print("Tipo Modelo: " + ((VAereo)v).getTipoModelo()+"\n");
                System.out.print("Turbina: " + ((VAereo)v).getTurbina()+"\n");
            }
            System.out.print("\n");

        }
    }
}
