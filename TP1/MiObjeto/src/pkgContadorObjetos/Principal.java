package pkgContadorObjetos;

public class Principal {
    public static void main(String[] args) {

        ContadorObjetos A = new ContadorObjetos();
        ContadorObjetos B = new ContadorObjetos();
        ContadorObjetos C = new ContadorObjetos();
        ContadorObjetos D = new ContadorObjetos();

        System.out.println("El número de objetos persona es = "+ ContadorObjetos.getNumeroObjetos());

    }

}
