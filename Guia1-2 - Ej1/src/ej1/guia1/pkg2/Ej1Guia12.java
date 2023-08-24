/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.guia1.pkg2;

/**
 *
 * @author naigg
 */
public class Ej1Guia12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Numero numero1 = new Numero(1459);

        boolean par = numero1.esPar();
        System.out.println("El valor es par? " + par);

        boolean positivo = numero1.esPositivo();
        System.out.println("El valor es positivo? " + positivo);

        boolean multiplo3 = numero1.esMultiplo3();
        System.out.println("El valor es multiplo de 3? " + multiplo3);
    }

}
