package pkgFiguras;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    Rectangulo(double b, double h) {
        this.base=b;
        this.altura=h;
    }

    @Override
    public double CalculaArea() {
        return this.area=this.base*this.altura;
    }
}
