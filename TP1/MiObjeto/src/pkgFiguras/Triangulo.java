package pkgFiguras;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    Triangulo(double b, double h)
    {
        this.base=b;
        this.altura=h;
    }

    public double CalculaArea() {
        return this.area=(this.base*this.altura)/2;
    }

}
