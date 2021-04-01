package clase2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        ArrayList<Alumno> alumnosArr = new ArrayList<>();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Alumno alumno1 = new Alumno("Noelina","35994856",df.parse("12/12/1991"),7, df.parse("03/04/2020"));
        Alumno alumno2 = new Alumno("Somita","33954307",df.parse("06/05/2017"),8, df.parse("03/05/2020"));
        Alumno alumno3 = new Alumno("Mogul","33954307",df.parse("29/06/2013"),4, df.parse("03/07/2020"));
        Alumno alumno4 = new Alumno("Chester","33954307",df.parse("06/07/2013"),2, df.parse("03/01/2020"));
        Alumno alumno5 = new Alumno("Emanuel","33954307",df.parse("06/04/1989"),5, df.parse("03/03/2020"));

        alumnosArr.add(alumno1);
        alumnosArr.add(alumno2);
        alumnosArr.add(alumno3);
        alumnosArr.add(alumno4);
        alumnosArr.add(alumno5);

        getAlumnoMayoresMateriasAprobadas(alumnosArr);
        getAlumnoMayorfechaIngreso(alumnosArr);

    }

    private static void getAlumnoMayoresMateriasAprobadas(ArrayList<Alumno> alumnosArr) {

        int mayorNumeroAprobadas = 0;
        int materiasAprobadasAlumno = 0;

        Alumno alumnoMasAprobadas = new Alumno();

        for (int i = 0; i < alumnosArr.size(); i++) {
            materiasAprobadasAlumno =  alumnosArr.get(i).GetMateriasAprobadas();
            if (materiasAprobadasAlumno > mayorNumeroAprobadas) {
                mayorNumeroAprobadas = materiasAprobadasAlumno;
                alumnoMasAprobadas = alumnosArr.get(i);
            }
        }

        System.out.println("El nombre del alumno con mas materias aprobadas es: " + alumnoMasAprobadas.getNombre());
    }

    private static void getAlumnoMayorfechaIngreso(ArrayList<Alumno> alumnosArr) throws ParseException {
        Date mayorfechaIngreso = new Date();
        Date fechaIngresoAlumno = new Date();

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        mayorfechaIngreso = df.parse("01/01/1980");

        Alumno alumnoMayorFechaIngreso = new Alumno();

        for (int i = 0; i < alumnosArr.size(); i++) {
            fechaIngresoAlumno = alumnosArr.get(i).GetFechaIngreso();
            if (fechaIngresoAlumno.after(mayorfechaIngreso)) {
                mayorfechaIngreso = fechaIngresoAlumno;
                alumnoMayorFechaIngreso = alumnosArr.get(i);

            }
        }

        System.out.println("El nombre del alumno con mayor fecha de ingreso es: " + alumnoMayorFechaIngreso.getNombre());
    }
}
