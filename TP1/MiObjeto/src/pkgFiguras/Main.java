package pkgFiguras;

public class Main {
    public static void main(String[] args) {
        Triangulo T = new Triangulo(5,2);
        Rectangulo R = new Rectangulo(3,3);
        Circulo C = new Circulo(2);

        System.out.println("Area de triangulo: " + T.CalculaArea());
        System.out.println("Area de Rectangulo: " + R.CalculaArea());
        System.out.println("Area de Circulo: " + C.CalculaArea());

    }
}
