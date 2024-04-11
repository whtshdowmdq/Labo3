package Punto2;

public class Circulo extends FiguraGeometrica implements MathConstante{
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        float area = (float)((this.radio*this.radio) * MathConstante.PI);
        return area;
    }
}
