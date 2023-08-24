package guia3.pkg1.ej1;

public class Guia31Ej1 {

    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("Juan", "Pérez", 30, 123456);

        // Crear 4 instancias de Perro
        Perro perro1 = new Perro("Bobby", "Labrador", 5, "Grande");
        Perro perro2 = new Perro("Luna", "Golden Retriever", 3, "Mediano");
        Perro perro3 = new Perro("Rocky", "Bulldog", 7, "Pequeño");
        Perro perro4 = new Perro("Max", "Chihuahua", 2, "Pequeño");

        // Hacer que la persona adopte cada uno de los perros
        persona.adoptarPerro(perro1);
        persona.adoptarPerro(perro2);
        persona.adoptarPerro(perro3);
        persona.adoptarPerro(perro4); // No se puede adoptar este perro, ya que se han adoptado 3 perros previamente

        // Obtener el perro más viejo de la persona
        Perro perroMasViejo = persona.perroMasGrande();
        System.out.println("El perro mas viejo es " + perroMasViejo.getNombre());
    }

}
