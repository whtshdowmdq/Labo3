package Punto4;

public abstract class Animal implements Comparable<Animal>{
    private String nombre;
    private int edad;
    private float peso;

    public Animal(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
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

    public float getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int compareTo(Animal otroAnimal){
        return Float.compare(this.peso,otroAnimal.peso);
    }

}
