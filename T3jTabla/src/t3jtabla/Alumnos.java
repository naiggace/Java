/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3jtabla;

/**
 *
 * @author naigg
 */
public class Alumnos {

    private int matricula;
    private String apellido;
    private String nombre;

    public Alumnos(int matricula, String apellido, String nombre) {
        this.matricula = matricula;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return matricula + " - " + apellido + " - " + nombre;
    }

}
