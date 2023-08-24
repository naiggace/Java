/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia3.ej3;

/**
 *
 * @author naigg
 */
public class Rueda {

    private String marca;
    private double presion;

    public Rueda(String marca, double presion) {
        this.marca = marca;
        this.presion = 28;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public void inflarRuedas() {
        presion = 28.0;
    }

    public void pincharRuedas() {
        presion = 0.0;
    }

    public void desinflarRuedas() {
        presion -= 0.5;
    }

}
