package guia1.pkg2.ej3;

public class Circulo {

    private final double pi=3.14;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void calcularArea() {
        double area = pi * radio * radio;
        System.out.println("El area es " + area + "mm2");
    }

    public void calcularPerimetro() {
        double perimetro = pi * radio * 2;
        System.out.println("El perimetro es " + perimetro + "mm");
    }
}
