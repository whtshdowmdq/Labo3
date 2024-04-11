package Punto4;



public class Perro extends Animal {
private String raza;

    public Perro(String nombre, int edad, float peso, String raza) {
        super(nombre, edad, peso);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "Nombre= "+ getNombre()+
                "Edad =" +getEdad() +
                "Peso =" +getPeso()+
                "raza='" + raza + '\'' +
                '}';
    }



}
