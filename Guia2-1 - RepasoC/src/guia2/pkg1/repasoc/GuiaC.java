package guia2.pkg1.repasoc;

import java.util.Scanner;

public class GuiaC {

    public static void Ej12() {
        Scanner teclado = new Scanner(System.in);
        int nota = 0;
        do {
            System.out.println("Ingrese nota entre 0 y 10");
            nota = teclado.nextInt();
        } while (nota < 1 || nota > 10);
        System.out.println("NOTA CORRECTA");
    }

    public static void Ej13() {
        int limite = 0;
        int suma = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Limite superior");
        limite = teclado.nextInt();
        while (suma <= limite) {
            System.out.println("Ingrese valor a sumar");
            suma = suma + teclado.nextInt();
        }
        System.out.println("Limite alcanzado");
    }

    public static void Ej14() {
        int num1 = 0;
        int num2 = 0;
        String salir = "no";
        int opc;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero");
            num1 = teclado.nextInt();
            System.out.println("Ingrese otro numero");
            num2 = teclado.nextInt();
        } while (num1 < 0 && num2 < 0);

        while (salir == "no") {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opción");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("SUMA= " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("RESTA= " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("MULTIPLICACIÓN= " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("DIVISIÓN= " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Está seguro que desea salir (S/N)");
                    salir = teclado.next();
                    salir = salir.toLowerCase();
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        }
    }

    public static void Ej15() {

        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int suma = 0;
        while (contador < 20) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            if (numero == 0) {
                System.out.println("Se capturó el número cero");
                break;
            }
            if (numero > 0) {
                suma += numero;
            }
            contador++;
        }
        System.out.println("La suma de los números ingresados es: " + suma);
    }

    public static void Ej16() {
        Scanner scanner = new Scanner(System.in);
        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;
        while (true) {
            System.out.print("Ingrese una cadena de caracteres (FDE para terminar): ");
            String cadena = scanner.nextLine();
            if (cadena.equals("&&&&&")) {
                break;
            }
            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                lecturasCorrectas++;
            } else {
                lecturasIncorrectas++;
            }
        }
        System.out.println("Informe:");
        System.out.println("Lecturas correctas: " + lecturasCorrectas);
        System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);
    }

    public static void Ej17() {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        System.out.println("Ingrese dimension del lado");
        num = teclado.nextInt();
        System.out.println(" ");
        for (int a = 1; a <= num; a++) {
            for (int b = 1; b <= num; b++) {
                if (a > 1 && a < num && b > 1 && b < num) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void Ej18() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros que se enceuntren entre 1 y 20");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        int num4 = teclado.nextInt();

        System.out.println("");

        System.out.print(num1 + " ");
        for (int b = 1; b <= num1; b++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num2 + " ");
        for (int b = 1; b <= num2; b++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num3 + " ");
        for (int b = 1; b <= num3; b++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num4 + " ");
        for (int b = 1; b <= num4; b++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
