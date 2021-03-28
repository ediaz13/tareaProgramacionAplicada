package pkgEscuela;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MainPersona {
    public static void main(String[] args) {
        try{
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            Persona Pers = new Persona("Juan","26582399",df.parse("30/09/1977"));
            Profesor Prof = new Profesor("Pedro","17545317",df.parse("05/01/1954"),3,df.parse("05/03/2012"));
            Alumno Alu = new Alumno("Jorge","42545317",df.parse("14/10/2001"),23,df.parse("08/04/2013"));

            System.out.println("Persona: " + Pers.GetNombre());
            System.out.println("Profesor: " + Prof.GetNombre());
            System.out.println("Alumno: " + Alu.GetNombre());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
