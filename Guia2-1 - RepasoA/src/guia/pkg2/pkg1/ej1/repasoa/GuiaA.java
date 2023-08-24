package guia.pkg2.pkg1.ej1.repasoa;

import java.util.Scanner;

public class GuiaA {

    public static void Ej1() {

        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese valor 1");
        int numero1 = valor.nextInt();
        System.out.println("Ingrese valor 2");
        int numero2 = valor.nextInt();
        System.out.println("La suma es " + (numero1 + numero2));
    }

    public static void Ej2() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = teclado.nextLine();
        System.out.println("Su nombre es " + nombre);
    }

    public static void Ej3() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su frase");
        String frase = teclado.nextLine();
        System.out.println("Su frase en mayuscula es " + frase.toUpperCase());
        System.out.println("Su frase en minuscula es " + frase.toLowerCase());
    }

    public static void Ej4() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su temperatura");
        int temperatura = teclado.nextInt();
        double f = 32 + (9 * temperatura / 5);
        System.out.println("La temperatura equivale a " + f + " F");
    }

    public static void Ej5() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su numero");
        int numero = teclado.nextInt();
        System.out.println("El doble es " + numero * 2);
        System.out.println("El triple es " + numero * 3);
        System.out.println("La raiz es " + Math.sqrt(numero));
    }}
