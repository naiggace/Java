package guia2.extra.integradora;

import java.util.Scanner;

public class ExtrasG1 {

    private static Scanner leer = new Scanner(System.in);

    public static void Ej1() {

        System.out.println("Ingrese cant de minutos a convertir");
        double min = leer.nextDouble();
        int dias = (int) Math.floor((min / 60) / 24);
        int horas = (int) Math.floor(min / 60 - dias * 24);
        System.out.print(dias + " Dias, ");
        System.out.println(horas + " Horas");

    }

    public static void Ej2() {

        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        int d = (int) (Math.random() * 10);
        System.out.println("Variables iniciales");
        System.out.println("A " + a);
        System.out.println("B " + b);
        System.out.println("C " + c);
        System.out.println("D " + d);
        int aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("Variables finales");
        System.out.println("A " + a);
        System.out.println("B " + b);
        System.out.println("C " + c);
        System.out.println("D " + d);

    }

    public static void Ej3() {

        System.out.println("Ingrese una letra");
        char letra = leer.nextLine().charAt(0);
        letra = Character.toLowerCase(letra);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("VOCAL");
        } else {
            System.out.println("Consonante");
        }

    }

    public static void Ej4() {

        int num = 0;
        do {
            System.out.println("Ingrese un numero entre 1 y 10");
            num = leer.nextInt();
        } while (num < 1 || num > 10);
        System.out.print("En numeros romano es ");
        switch (num) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
        }

    }

    public static void Ej5() {

        System.out.println("Ingrese tipo de socio");
        char letra = leer.nextLine().charAt(0);
        letra = Character.toLowerCase(letra);
        if (letra != 'a' && letra != 'b' && letra != 'c') {
            System.out.println("TIPO INVALIDO");
        } else {
            System.out.println("Ingrese costo de su medicamento");
            double costo = leer.nextDouble();
            switch (letra) {
                case 'a':
                    System.out.println("Ud tiene un 50% de descuento");
                    System.out.println("Debe abonar $" + (costo * .5));
                    break;
                case 'b':
                    System.out.println("Ud tiene un 35% de descuento");
                    System.out.println("Debe abonar $" + (costo * .65));
                    break;
                case 'c':
                    System.out.println("Ud tiene un 0% de descuento");
                    System.out.println("Debe abonar $" + (costo));
                    break;
            }
        }

    }

    public static void Ej6() {

        int cant = 0;
        double suma = 0;
        char resp;
        do {
            System.out.println("Desea ingresar una altura? (S/N)");
            resp = leer.nextLine().charAt(0);
            resp = Character.toLowerCase(resp);
            if (resp == 's') {
                System.out.println("Ingrese una altura (coma decimal)");
                suma = suma + leer.nextDouble();
                cant = cant + 1;
                leer.nextLine(); // Para limpiar el buffer del scanner
            }
        } while (resp == 's');
        if (cant > 0) {
            double promedio = suma / cant;
            System.out.println("La cantidad de alturas ingresadas es: " + cant);
            System.out.println("La suma de las alturas ingresadas es: " + suma);
            System.out.println("El promedio de las alturas ingresadas es: " + promedio);
        } else {
            System.out.println("No se ingresaron alturas.");
        }

    }

    public static void Ej7a() {
        //con do-while

        System.out.println("Ingrese la cantidad de numeros a ingresar");
        int cant = leer.nextInt();
        int cont = 0;
        int max = 0;
        int min = 9999999;
        int suma = 0;
        int num;
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            cont = cont + 1;
            suma = suma + num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        } while (cont < cant);
        System.out.println("");
        System.out.println("Analisis:");
        System.out.println("min " + min);
        System.out.println("max " + max);
        System.out.println("prom " + suma / cant);

    }

    public static void Ej7b() {
//con while

        System.out.println("Ingrese la cantidad de numeros a ingresar");
        int cant = leer.nextInt();
        int cont = 0;
        int max = 0;
        int min = 9999999;
        int suma = 0;
        int num;
        while (cont < cant) {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            cont = cont + 1;
            suma = suma + num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("");
        System.out.println("Analisis:");
        System.out.println("min " + min);
        System.out.println("max " + max);
        System.out.println("prom " + suma / cant);

    }

    public static void Ej8() {

        int cantidadNumeros = 0;
        int cantidadPares = 0;
        int cantidadImpares = 0;
        while (true) {
            System.out.print("Ingrese un número entero: ");
            int num = leer.nextInt();
            if (num < 0) {
                continue; // No se suma y se pide otro número
            }
            cantidadNumeros++;
            if (num % 5 == 0) {
                break; // Se detiene la lectura de números
            }
            if (num % 2 == 0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
        }
        System.out.println("Cantidad de números leídos: " + cantidadNumeros);
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);

    }

    public static void Ej9() {

        int max;
        int min;
        int cont;
        int resto;
        do {
            System.out.println("Ingrese un numero 1 (> 1)");
            cont = leer.nextInt();
        } while (cont < 1);
        do {
            System.out.println("Ingrese un numero 2 (> 1)");
            resto = leer.nextInt();
        } while (resto < 1);
        max = Math.max(cont, resto);
        min = Math.min(cont, resto);
        cont = 0;
        resto = max;
        while (resto > min) {
            resto = resto - min;
            cont = cont + 1;
        }
        System.out.println("Resultado " + cont);
        System.out.println("Resto " + resto);

    }

    public static void Ej10() {

        int num1 = (int) (Math.random() * 11); // Genera un número aleatorio entre 0 y 10
        int num2 = (int) (Math.random() * 11); // Genera otro número aleatorio entre 0 y 10
        int respuesta;

        do {
            System.out.println("¿Cuánto es " + num1 + " x " + num2 + "? ");
            respuesta = leer.nextInt();

            if (respuesta == num1 * num2) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. Intente nuevamente.");
            }
        } while (respuesta != num1 * num2);
    }

    public static void Ej11() {
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        String numACadena = "" + num;
        System.out.println("La long es " + numACadena.length());
    }

    public static void Ej12() {
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        System.out.println("A-B-C");
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    if (a == 3) {
                        System.out.print("E-");
                    } else {
                        System.out.print(a + "-");
                    }
                    if (b == 3) {
                        System.out.print("E-");
                    } else {
                        System.out.print(b + "-");
                    }
                    if (c == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(c);
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void Ej13() {
        System.out.println("Ingrese alto de la escalera");
        int alto = leer.nextInt();
        System.out.println();
        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
