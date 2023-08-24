/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3jtabla;

/**
 *
 * @author naigg
 */
public class Productos {

    private String categoria;
    private String producto;
    private double precio;

    public Productos(String categoria, String producto, double precio) {
        this.categoria = categoria;
        this.producto = producto;
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return categoria + " - " + producto + " - " + precio;
    }

}
