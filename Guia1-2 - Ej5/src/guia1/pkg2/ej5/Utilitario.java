package guia1.pkg2.ej5;

public class Utilitario {

    public static void dibujaCuadrado(int n) {

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b = b + 1) {
                if (a == 1 || a == n) {
                    System.out.print("*");
                } else {
                    if (b == n || b == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(" ");
        }
    }

    public static void elMayorEs(int ent1, int ent2, int ent3) {
        if (ent1 == ent2 && ent1 == ent3) {
            System.out.println("Los 3 numeros son iguales");
        } else {
            if (ent1 > ent2 && ent1 > ent3) {
                System.out.println("El mayor es " + ent1);
            }
            if (ent2 > ent1 && ent2 > ent3) {
                System.out.println("El mayor es " + ent2);
            } else {
                System.out.println("El mayor es " + ent3);
            }
        }
    }

    public static void elDiaEs(int numero) {
        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("DIA INCORRECTO");
                break;

        }
    }
}
