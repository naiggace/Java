package guia1.pkg2.ej;

public class Calculo {

    public static boolean esPrimo(double num) {
        int cont = 0;
        for (int a = 1; a <= num; a++) {
            if ((num % a == 0)) {
            } else {
                cont = cont + 1;
            }
        }
        return cont != 2;
    }

    public static int valorAbsoluto(int num) {
        return Math.abs(num);
    }

    public static void calcularRaiz(double a, double b, double c) {
        if ((Math.sqrt(b * b - 4 * a * c)) > 0) {

            double raiz1 = (-b + (Math.sqrt(b * b - 4 * a * c))) / 4 * a;
            double raiz2 = (-b - (Math.sqrt(b * b - 4 * a * c))) / 4 * a;
            System.out.println("Las raices son: ");
            System.out.println("raiz 1 " + raiz1);
            System.out.println("raiz 2 " + raiz2);
        } else {
            System.out.println("La ecuacion no posee raiz");
        }

    }
}
