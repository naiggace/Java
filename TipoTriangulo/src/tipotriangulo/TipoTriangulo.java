/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipotriangulo;

/**
 *
 * @author naigg
 */
public class TipoTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // usando STATIC en un metodo puedo usarlo sin crear un objeto
        Lados.validacion(1, 2, 3);
        // creando un objeto seria asi
        Lados triangulo1 = new Lados(20, 20, 30);
        Lados.validacion(triangulo1.getLado1(), triangulo1.getLado2(), triangulo1.getLado3());
    }

}
