package pkgContadorObjetos;

public class ContadorObjetos {
    private static int numObjetosCreados;

    public ContadorObjetos(){
        numObjetosCreados++;
    }
    public static int getNumeroObjetos(){
        return numObjetosCreados;
    }

}
