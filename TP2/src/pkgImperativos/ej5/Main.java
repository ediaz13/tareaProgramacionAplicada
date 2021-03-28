package pkgImperativos.ej5;

public class Main {
    public static void main(String[] args) {
        int valor=5;
        System.out.println(IncrementaDato(valor));
    }

    public static int IncrementaDato(int val) {
        ++val;
        return val;
    }
}
