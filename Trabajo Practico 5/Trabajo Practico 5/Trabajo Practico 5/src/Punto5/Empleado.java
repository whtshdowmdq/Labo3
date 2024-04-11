package Punto5;

import Punto3.Persona;

public abstract class Empleado extends Persona {
    private float salario;

    public Empleado(String nombre, int edad, String dni, float salario) {
        super(nombre, edad, dni);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public abstract float calcularBonificacion();
}
