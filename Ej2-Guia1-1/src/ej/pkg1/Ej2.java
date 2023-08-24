/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg1;

/**
 *
 * @author naigg
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-> Vamos a instanciar una PC");

        Computadora seleccion = new Computadora(2, "ASUS", "TUF F15", 35000, 4);

        seleccion.presentar();

        seleccion.setMarca("Asus");

        System.out.println("-> equipo: " + seleccion.getMarca());
        System.out.println("-> equipo: " + seleccion.getModelo());
        System.out.println("-> tipo: " + seleccion.getTipo());
        System.out.println("-> precio: $" + seleccion.getPrecio());
        System.out.println("-> stock: " + seleccion.getStock());
    }

}
