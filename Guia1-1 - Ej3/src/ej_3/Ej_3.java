package ej_3;

public class Ej_3 {

    public static void main(String[] args) {
        // TODO code application logic here

        Jugador Carga = new Jugador();

        Carga.setNombre("Juan");
        Carga.setPuntaje(140);
        Carga.setNacionalidad("Argentino");
        Carga.setEdad(35);

        System.out.println("Nombre: " + Carga.getNombre());
        System.out.println("Puntaje: " + Carga.getPuntaje());
        System.out.println("Nacionalidade: " + Carga.getNacionalidad());
        System.out.println("Edad: " + Carga.getEdad());
    }

}
