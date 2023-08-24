
public class Triangulo extends Figura {

    private double base;

    private double altura;

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro es " + base * altura / 2);
    }

    @Override
    public void calcularArea() {
        System.out.println("TA DIFICIL");
    }
}
