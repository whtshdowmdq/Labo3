package Punto3;

import java.util.ArrayList;
import java.util.Comparator;

public class Persona implements Comparable{
    private String nombre;
    private int edad;
    private String dni;

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Persona) {
            Persona persona = (Persona) o;
            if (persona.getEdad() < this.edad) {
                return -1;
            } else if (persona.getEdad() == this.edad) {
                return 0;
            } else {
                return 1;
            }
        } else {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public String toString() {
        return "\n"+ "Nombre: " + nombre + ", Edad: " + edad + ", DNI: " + dni + "\n ------------ ";
    }
}
