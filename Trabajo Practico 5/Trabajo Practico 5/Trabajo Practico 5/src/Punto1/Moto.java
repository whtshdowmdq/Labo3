package Punto1;

public class Moto extends Vehiculo{
private int cilindrada;

    public Moto(String marca, String modelo, float precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public float calcularPrecioAlquiler() {
        float monto = (float) super.getPrecio()*2;
        return monto;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Punto1.Moto{" +
                "cilindrada=" + cilindrada +
                '}';
    }
}
