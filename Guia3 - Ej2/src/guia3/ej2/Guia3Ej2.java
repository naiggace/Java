package guia3.ej2;

import java.time.LocalDate;

public class Guia3Ej2 {

    public static void main(String[] args) {

        //Genero un kiosko
        Kiosko kiosko = new Kiosko("Eva Peron 1300", "el 22", 123456);

        //Genero 3 empleados
        Empleado empleado1 = new Empleado("Juan", "Perez", LocalDate.of(2019, 6, 15), 12345678);
        Empleado empleado2 = new Empleado("Maria", "Gomez", LocalDate.of(2020, 3, 10), 87654321);
        Empleado empleado3 = new Empleado("Carlos", "Lopez", LocalDate.of(2018, 9, 20), 45678912);
        Empleado empleado4 = new Empleado("Jorge", "Uboldi", LocalDate.of(2017, 6, 02), 45378912);

        //Agrego 3 empleados
        kiosko.agregarEmpleado(empleado1);
        kiosko.agregarEmpleado(empleado2);
        kiosko.agregarEmpleado(empleado3);
        kiosko.agregarEmpleado(empleado4);

        //Empleado mas antiguo
        Empleado masAntiguo = kiosko.obtenerEmpleadoMayorAntiguedad();
        System.out.println("El mas antiguo es " + masAntiguo.getNombre()+" "+masAntiguo.getApellido());
    }

}
