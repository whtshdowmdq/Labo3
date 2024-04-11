package Punto1;

public class Coche extends Vehiculo{
private int numPuertas;

    public Coche(String marca, String modelo, float precio, int numPuertas) {
        super(marca, modelo, precio);
        this.numPuertas = numPuertas;
    }

    @Override
    public float calcularPrecioAlquiler() {
       float monto = (float) super.getPrecio()/5;
        return monto;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Punto1.Coche{" +
                "numPuertas=" + numPuertas +
                '}';
    }
}
