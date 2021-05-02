package pkgTP6.Ej1;

public class MainListaDoblementeEnlazada {
    public static void main(String[] args) {
        ListaDoblementeEnlazada lista =	new ListaDoblementeEnlazada();
        lista.Alta(25, "Juan");
        lista.Alta(45, "Maria");
        lista.Alta(31, "Virginia");
        lista.Alta(19, "Lorena");
        lista.Alta(12, "Pedro");
        lista.Alta(13, "Mariano");
        lista.Alta(78, "Jorge");

        lista.ImpresionAdelante();
        System.out.println("");

        lista.Baja("Pedro");
        lista.ImpresionAtras();

    }
}
