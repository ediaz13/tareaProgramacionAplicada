package pkgFiguras;

public class Circulo  extends Figura {
    static final double pi=3.1416;
    private double radio;

    Circulo(double r) {
        this.radio=r;
    }

    public double CalculaArea() {
        return this.area=(Math.PI * Math.pow(this.radio, 2.0));
        //return this.area=(pi * this.radio * this.radio);

    }

}
