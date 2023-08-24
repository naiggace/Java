package guia3.ej3;

public class Guia3Ej3 {

    public static void main(String[] args) {
        Auto auto1 = new Auto("Rojo", "ABC123");

        Rueda rueda1 = new Rueda("Marca1", 28.0);
        Rueda rueda2 = new Rueda("Marca2", 28.0);
        Rueda rueda3 = new Rueda("Marca3", 28.0);
        Rueda rueda4 = new Rueda("Marca4", 28.0);

        auto1.agregarRueda(rueda1);
        auto1.agregarRueda(rueda2);
        auto1.agregarRueda(rueda3);
        auto1.agregarRueda(rueda4);

        auto1.inflarRuedas();
        auto1.avanzar(50);

        auto1.retroceder(30);
        auto1.desinflarRuedas();

        auto1.tanqueVacio();
        auto1.avanzar(100);

    }

}
