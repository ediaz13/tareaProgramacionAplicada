package pkgImperativos.ej13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        CargarMatrix(mat);
        MostrarMatrix(mat);

    }

    public static void CargarMatrix(int[][] m)
    {
        int filas=m.length;
        int columnas=m[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<filas;i++)
        {
            for(int j=0;j<columnas;j++)
            {
                System.out.println("Ingrese Valor: ");
                m[i][j]=sc.nextInt();
            }
        }

    }

    public static void MostrarMatrix(int[][] m)
    {
        int filas=m.length;
        int columnas=m[0].length;

        for(int i=0;i<filas;i++)
        {
            for(int j=0;j<columnas;j++)
            {
                System.out.println(m[i][j]);
            }
        }

    }

}

