
public class Circulo extends Figura {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro es " + radio * PI * 2);
    }

    @Override
    public void calcularArea() {
        System.out.println("El area es " + PI * radio * radio);
    }
}
