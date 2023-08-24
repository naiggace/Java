package guia1.pkg2.ej6;

public class Guia12Ej6 {

    public static void main(String[] args) {
        Triangulo figura = new Triangulo(3.0, 4.0, 5.0);

        System.out.println("Es traingulo? -> "+figura.esUnTriangulo());
        figura.tipoTriangulo();
    }

}
