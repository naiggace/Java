
public class Guerrero extends Personaje {

    private boolean caballo;

    public Guerrero(Position ubicacion, String nick) {
        super(ubicacion, nick);
        this.caballo = false;
    }

    @Override
    public void avanzar() {
        System.out.println("");
        System.out.println("Posicion Inicial");
        System.out.println("X " + ubicacion.getX());
        System.out.println("Y " + ubicacion.getY());
        if (caballo == true) {
            switch (orientacion) {
                case 'N':
                    ubicacion.setY(ubicacion.getY() + 10);
                    break;
                case 'S':
                    ubicacion.setY(ubicacion.getY() - 10);
                    break;
                case 'E':
                    ubicacion.setX(ubicacion.getX() + 10);
                    break;
                case 'O':
                    ubicacion.setX(ubicacion.getX() - 10);
                    break;
            }
        } else {
            super.avanzar();
        System.out.println("Ud. avanzo con orientacion " + orientacion);
        System.out.println("Nueva ubicacion");
        System.out.println("X " + ubicacion.getX());
        System.out.println("Y " + ubicacion.getY());
        System.out.println("");
    }}

    @Override
    public void disparar() {
        super.disparar();
        if (energia < 30) {
            caballo = false;
            System.out.println("Has perdido el caballo, tienes menos de 30 de energia");
        }

    }
}
