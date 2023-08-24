package guia1.pkg2.ej7;

public class Guia12Ej7 {

    public static void main(String[] args) {

        Robot tito = new Robot("TITO");
        
        System.out.println("nombre robot: " + tito.getNombre());
        
        while (tito.getBateria() > 0) {
           
            tito.avanzar(1);

            System.out.println("bateria vacia? " + tito.bateriaVacia());
        }

    }
}
