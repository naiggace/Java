package ej1.guia1.pkg2;

public class Numero {

    private int atributo;

    public Numero(int atributo) {
        this.atributo = atributo;
    }

    public int getAtributo() {
        return atributo;
    }

    public void setAtributo(int atributo) {
        this.atributo = atributo;
    }

    public boolean esPar() {
        return this.atributo % 2 == 0;
    }

    public boolean esPositivo() {
        return this.atributo >= 0;
    }

    public boolean esMultiplo3() {
        return this.atributo % 3 == 0;
    }
}
