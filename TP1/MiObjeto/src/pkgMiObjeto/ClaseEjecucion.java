package pkgMiObjeto;

import java.util.Scanner;

public class ClaseEjecucion {
    public static void main(String[] args) {

        /*
        ClaseValor obj1 = new ClaseValor();

        ClaseValor obj2 = new ClaseValor(6);
        //ClaseValor obj3 = new ClaseValor(obj2);

        //objValor.SetValor(5);
        System.out.println("Valor: " + obj1.getValor());
        System.out.println("Valor: " + obj2.getValor());
        */
        //Usar constructor por defecto
        ClaseValor objValor1 = new ClaseValor();
        System.out.println("Valor constructor por defecto: " + objValor1.getValor());

        //Usar constructor con parámetro
        ClaseValor objValor2 = new ClaseValor(5);
        System.out.println("Valor constructor con parámetro: " + objValor2.getValor());

        //Usar constructor de copia
        ClaseValor objValor3 = new ClaseValor(objValor2);
        System.out.println("Valor constructor de copia: " + objValor3.getValor());
        System.out.println("Valor constructor de copia: " + objValor3.getValor());

        ClaseValor objValor = new ClaseValor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese valor: ");
        objValor.setValor(sc.nextInt());
        System.out.println("Valor: " + objValor.getValor());


    }
}
