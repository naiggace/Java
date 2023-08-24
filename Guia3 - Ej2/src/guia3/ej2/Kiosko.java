package guia3.ej2;

public class Kiosko {

    private String direccion;
    private String nombre;
    private int cuit;
    private Empleado empleado1;
    private Empleado empleado2;
    private Empleado empleado3;

    public Kiosko(String direccion, String nombre, int cuit) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.cuit = cuit;
    }

    // Método para adoptar un perro
    public void agregarEmpleado(Empleado empleado) {
        if (empleado1 == null) {
            empleado1 = empleado;
        } else if (empleado2 == null) {
            empleado2 = empleado;
        } else if (empleado3 == null) {
            empleado3 = empleado;
        } else {
            System.out.println("Ya no puedo agregar más empleados");
        }
    }

    public Empleado obtenerEmpleadoMayorAntiguedad() {
        Empleado empleadoMayorAntiguedad = empleado1;

        if (empleado2 != null && empleado2.getFechaIngreso().isBefore(empleadoMayorAntiguedad.getFechaIngreso())) {
            empleadoMayorAntiguedad = empleado2;
        }

        if (empleado3 != null && empleado3.getFechaIngreso().isBefore(empleadoMayorAntiguedad.getFechaIngreso())) {
            empleadoMayorAntiguedad = empleado3;
        }

        return empleadoMayorAntiguedad;
    }
}
