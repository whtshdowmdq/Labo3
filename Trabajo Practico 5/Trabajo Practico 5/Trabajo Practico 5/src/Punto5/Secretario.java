package Punto5;

public class Secretario extends Empleado {
    private int numHorasExtra;

    public Secretario(String nombre, int edad, String dni, float salario, int numHorasExtra) {
        super(nombre, edad, dni, salario);
        this.numHorasExtra = numHorasExtra;
    }

    public int getNumHorasExtra() {
        return numHorasExtra;
    }

    public void setNumHorasExtra(int numHorasExtra) {
        this.numHorasExtra = numHorasExtra;
    }

    //Se calcula la bonificacion de 10000 pesos por cada hora extra realizada
    @Override
    public float calcularBonificacion() {
        return numHorasExtra *10000;
    }
}
