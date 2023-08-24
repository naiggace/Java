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
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-> Vamos a instanciar un producto");

        Producto seleccion = new Producto(3, "lavarropa", 35000, 4);

        seleccion.saludar();

        seleccion.setDescripcion("microonda");

        System.out.println("-> equipo: " + seleccion.getDescripcion());
        System.out.println("-> tipo: " + seleccion.getTipo());
        System.out.println("-> precio: $" + seleccion.getPrecio());
        System.out.println("-> stock: " + seleccion.getStock());
    }

}
