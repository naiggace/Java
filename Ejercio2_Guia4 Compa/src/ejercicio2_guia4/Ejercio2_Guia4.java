package ejercicio2_guia4;

public class Ejercio2_Guia4 {

    public static void main(String[] args) {
//        Electrodomestico dip = new Electrodomestico(1525.20, "ROJO", 'B', 3);

        Electrodomestico lavadora1 = new Lavadora(40, 18522.35, "VERDE", 'A', 4);
        lavadora1.comprobarColor(lavadora1.getColor());
        lavadora1.comprobarConsumo(lavadora1.getConsumoEnergetico());
        lavadora1.precioFinal();
        
        System.out.println(">>> Precio final: $" + lavadora1.getPrecio());

        
        Electrodomestico televisor1= new Televisor(40,true,100000,"Rojo",'A',30);
        televisor1.comprobarColor(televisor1.getColor());
        televisor1.comprobarConsumo(televisor1.getConsumoEnergetico());
        televisor1.precioFinal();
        System.out.println(">>> Precio final: $" + televisor1.getPrecio());
    }

}
