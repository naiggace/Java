
public class Guia4Ej2 {

    public static void main(String[] args) {

        Electrodomestico lavadora1 = new Lavadora(40, 18522.35, "VERDE", 'A', 4);
        lavadora1.comprobarColor(lavadora1.getColor());
        lavadora1.comprobarConsumo(lavadora1.getConsumoEnergetico());
        lavadora1.precioFinal();
        System.out.println(">>> Precio final: $" + lavadora1.getPrecio());

        Electrodomestico televisor1 = new Televisor(40, true, 100000, "Rojo", 'D', 30);
        televisor1.comprobarColor(televisor1.getColor());
        televisor1.comprobarConsumo(televisor1.getConsumoEnergetico());
        televisor1.precioFinal();
        System.out.println(">>> Precio final: $" + televisor1.getPrecio());
    }

}
