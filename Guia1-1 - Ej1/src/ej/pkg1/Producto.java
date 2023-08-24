package ej.pkg1;

public class Producto {

    private int tipo;
    private String descripcion;
    private double precio;
    private int stock;

    public Producto(int tipo, String descripcion, double precio, int stock) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto() {
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void saludar() {
        System.out.println("Hola buenas tardes!Quiere un " + descripcion);
    }

}
