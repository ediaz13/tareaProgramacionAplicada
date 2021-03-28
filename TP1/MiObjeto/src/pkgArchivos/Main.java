package pkgArchivos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//Persistencia de Datos: Crear un archivo
public class Main {
    public static void main(String[] args) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        Scanner reader = new Scanner(System.in);
        ArrayList<String> numeros = new ArrayList<String>(); // Create an ArrayList object

        try
        {
            fichero = new FileWriter("C:\\Users\\diaze\\OneDrive\\Escritorio\\Escritorio\\fichero.txt");
            pw = new PrintWriter(fichero);

            /*
            for (int i = 0; i < 10; i++) {
                pw.println("Linea " + (i+1));
            }
            */

            for (int i = 0; i < 5; i++) {
                System.out.println("Ingresa un valor perro: ");
                int numero = reader.nextInt();
                pw.println(numero);
            }


            System.out.println("Archivo guardado con exito");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (fichero != null)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        //Lectura de Archivo
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File ("C:\\Users\\diaze\\OneDrive\\Escritorio\\Escritorio\\fichero.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null) {
                System.out.println(linea);
                numeros.add(linea);
            }

            System.out.println("El array list es el siguiente: ");
            for (int i=0;i<numeros.size();i++) {
                System.out.println(numeros.get(i));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }






    }
}
