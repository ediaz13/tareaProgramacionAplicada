package pkgImperativos.ej12;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        MostrarMatrix(mat);
        //MostrarVector(listaNumeros);

    }

    public static void MostrarMatrix(int[][] m)
    {
        int filas=m.length;
        int columnas=m[0].length;
        int sumaFila = 0;
        int sumaCol = 0;
        int sumaDiag = 0;
        for(int i=0;i<filas;i++)
        {
            for(int j=0;j<columnas;j++)
            {
                if (i == j) {
                    sumaDiag = sumaDiag + m[i][j];

                } else if (i == 0) {
                    sumaFila = sumaFila + m[i][j];
                    System.out.println(m[i][j]);
                    System.out.println("SumaFila en " + i + ": " + sumaFila);

                } else if (j == 0){
                    sumaCol = sumaCol + m[i][j];
                    System.out.println(m[i][j]);
                    System.out.println("SumaCol en " + j + ": " + sumaCol);
                }
                //System.out.println(m[i][j]);
            }
        }

        System.out.println("La suma de los valores de la primer fila es: " + sumaFila);
        System.out.println("La suma de los valores de la primer columna es: " + sumaCol);
        System.out.println("La suma de los valores de la diagonal es: " + sumaDiag);

    }
}
