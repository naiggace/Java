package ej2.guia1.pkg2;

public class Cuadrilatero {

    private double alto;
    private double largo;

    public Cuadrilatero(double alto, double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void calcularPerimetro() {
        double perimetro = largo * 2 + alto * 2;
        System.out.println("El perimetro es " + perimetro);
    }

    public void calcularArea() {
        double area = largo * alto;
        System.out.println("El area es " + area);
    }

    public void esCuadrado() {
        if (alto == largo) {
            System.out.println("Es cuadrado");
        } else {
            System.out.println("Es rectangulo");
        }

    }
}
