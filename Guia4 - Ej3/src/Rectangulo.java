
public class Rectangulo extends Figura {

    private double lado1;

    private double lado2;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro es " + lado1 * 2 + lado2 * 2);
    }

    @Override
    public void calcularArea() {
        System.out.println("El area es " + lado1 * lado2);
    }
}
