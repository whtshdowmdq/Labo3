package Punto4;


public class Gato extends Animal {
private String color;
private String tipoPelaje;

    public Gato(String nombre, int edad, float peso, String color, String tipoPelaje) {
        super(nombre, edad, peso);
        this.color = color;
        this.tipoPelaje = tipoPelaje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "Nombre= "+ getNombre()+
                "Edad =" +getEdad() +
                "Peso =" +getPeso()+
                "color='" + color + '\'' +
                ", tipoPelaje='" + tipoPelaje + '\'' +
                '}';
    }



}
