package guia3.pkg1.ej1;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Perro perro1;
    private Perro perro2;
    private Perro perro3;

    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    // Método para adoptar un perro
    public void adoptarPerro(Perro perro) {
        if (perro1 == null) {
            perro1 = perro;
        } else if (perro2 == null) {
            perro2 = perro;
        } else if (perro3 == null) {
            perro3 = perro;
        } else {
            System.out.println("Ya no puedo adoptar más perros");
        }
    }

    // Método para obtener el perro de mayor edad
    public Perro perroMasGrande() {
        Perro perroMasGrande = perro1;

        if (perro2 != null && perro2.getEdad() > perroMasGrande.getEdad()) {
            perroMasGrande = perro2;
        }

        if (perro3 != null && perro3.getEdad() > perroMasGrande.getEdad()) {
            perroMasGrande = perro3;
        }

        return perroMasGrande;
    }
}
