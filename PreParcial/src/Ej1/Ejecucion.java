package Ej1;

public class Ejecucion {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Carrera a=new Carrera("UBA","Diseño Industrial",10,"Diseño");
        Carrera b=new Carrera("USAL","Comercializacion",10,"Economica");
        Carrera c=new Carrera("Kennedy","Odontologia",12,"Salud");

        System.out.println(a.getUniversidad()+ " " + a.getCarrera()+ " " + a.getCuatrimestres() + " " + a.getOrientacion()+ " ");
        System.out.println(b.getUniversidad()+ " " + b.getCarrera()+ " " + b.getCuatrimestres() + " " + b.getOrientacion()+ " ");
        System.out.println(c.getUniversidad()+ " " + c.getCarrera()+ " " + c.getCuatrimestres() + " " + c.getOrientacion()+ " ");
    }
}

