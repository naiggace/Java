package guia1.pkg2.ej7;

public class Robot {

    private int bateria = 500;
    private String nombre;

    public Robot(String nombre) {
        this.nombre = nombre;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void avanzar(int pasos) {
        this.bateria = (int) (bateria - pasos * 0.1);

        System.out.println("" + bateria);

    }

    public boolean bateriaVacia() {
        return bateria <= 0;
    }

}
