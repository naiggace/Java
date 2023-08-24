package ejercicio2_guia4;

public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora(int carga, double precio, String color, char consumoEnergia, double peso) {
        super(precio, color, consumoEnergia, peso);
        this.carga = carga;
    }
    
    public Lavadora(){}

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            this.precio += 500;
        }
    }
}
