
public class TestHerencia {

    public static void main(String[] args) {
        Position posicionInicial = new Position(100, 200);
        Guerrero thor = new Guerrero(posicionInicial, "Thor");
        thor.girar();
        thor.girar();
        thor.girar();
        for (int i = 0; i < 5; i++) {
            thor.avanzar();
            thor.avanzar();
        }
        for (int i = 0; i < 8; i++) {
            thor.disparar();
        }
        System.out.println("Posicion final X: " + thor.ubicacion.getX());
        System.out.println("Posicion final Y: " + thor.ubicacion.getY());
    }
}
