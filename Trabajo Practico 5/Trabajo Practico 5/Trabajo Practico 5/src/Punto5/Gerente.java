package Punto5;

public class Gerente extends Empleado{
    private String Departamento;

    public Gerente(String nombre, int edad, String dni, float salario, String departamento) {
        super(nombre, edad, dni, salario);
        Departamento = departamento;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    @Override
    public float calcularBonificacion() {
        return this.getSalario() * 0.2f;
    }
}
