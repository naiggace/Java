package ej.pkg1;

public class Computadora {

    private int tipo;
    private String marca;
    private String modelo;
    private double precio;
    private int stock;

    public Computadora(int tipo, String marca, String modelo, double precio, int stock) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    public Computadora() {
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public void presentar() {
        System.out.println("Hola buenas tardes!Quiere un " + marca + " " + modelo);
    }

}
