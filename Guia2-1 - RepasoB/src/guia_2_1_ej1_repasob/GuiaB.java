package guia_2_1_ej1_repasob;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author naigg
 */
public class GuiaB {

    public static void Ej6() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese num 1: ");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese num 2: ");
        int num2 = teclado.nextInt();
        int mayor = Math.max(num1, num2);
        System.out.println("El número mayor es: " + mayor);
    }

    public static void Ej7() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese num: ");
        int num = teclado.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado es impar");
        }
    }

    public static void Ej8() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese clave");
        String frase = teclado.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

    public static void Ej9() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese frase o palabra");
        String frase = teclado.nextLine();
        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

    public static void Ej10() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese palabra");
        String palabra = teclado.nextLine();
        char letra = palabra.charAt(0);
        System.out.println("Primer letra: " + letra);
    }

    public static void Ej11() {
        Scanner teclado = new Scanner(System.in);
        int tipoMotor = 0;
//        do {
        System.out.println("Ingrese tipo de motor de 1 a 4");
        tipoMotor = teclado.nextInt();
        //       } while (tipoMotor < 1 || tipoMotor > 4);
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("a bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }

    }
}
