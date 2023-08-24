package ejercicio2_guia4;

public class Televisor extends Electrodomestico {

    private double resolucion;

    private boolean sintonizadorTDT;

    public Televisor(double resolucion, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor() {
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            this.precio *= 1.3;
        }

        if (sintonizadorTDT) {
            this.precio += 500;
        }
    }
}
