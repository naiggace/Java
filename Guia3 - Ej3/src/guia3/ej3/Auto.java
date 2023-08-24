package guia3.ej3;

public class Auto {

    private String color;
    private String patente;
    private double combustible;
    private Rueda rueda1;
    private Rueda rueda2;
    private Rueda rueda3;
    private Rueda rueda4;

    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;
        this.combustible = 50;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public void agregarRueda(Rueda rueda) {
        if (rueda1 == null) {
            rueda1 = rueda;
        } else if (rueda2 == null) {
            rueda2 = rueda;
        } else if (rueda3 == null) {
            rueda3 = rueda;
        } else {
            System.out.println("Ya no puedo agregar más ruedas");
        }
    }

    public void avanzar(int mts) {
        this.combustible = (int) (combustible - mts * 0.1);

        System.out.println("" + combustible);

    }

    public void retroceder(int mts) {
        this.combustible = (int) (combustible - mts * 0.1);

        System.out.println("" + combustible);

    }

    public void tanqueVacio() {
        this.combustible = 50;
        System.out.println("El tanque ha sido cargado nuevamente");
    }

    public void inflarRuedas() {
        if (rueda1 != null) {
            rueda1.inflarRuedas();
        }
        if (rueda2 != null) {
            rueda2.inflarRuedas();
        }
        if (rueda3 != null) {
            rueda3.inflarRuedas();
        }
        if (rueda4 != null) {
            rueda4.inflarRuedas();
        }
    }

    public void desinflarRuedas() {
    }
}
