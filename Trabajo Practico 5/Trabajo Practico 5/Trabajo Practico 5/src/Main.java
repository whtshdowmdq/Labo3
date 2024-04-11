import Punto1.Coche;
import Punto1.Moto;
import Punto2.Circulo;
import Punto2.Rectangulo;
import Punto3.Persona;
import Punto4.Animal;
import Punto4.Gato;
import Punto4.Perro;
import Punto5.Empleado;
import Punto5.Gerente;
import Punto5.Secretario;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Ford", "Culo", 2000.5f, 5);
        Moto moto = new Moto("FACUNDITO","Viejo", 6000, 250);
        float precioCoche = coche.calcularPrecioAlquiler();
        System.out.println("El precio es: "+ precioCoche);
        float precioMoto = moto.calcularPrecioAlquiler();
        System.out.println("El precio del alquiler de moto es: "+precioMoto);

        Rectangulo rectangulo = new Rectangulo(5,5);
        float areaRectangulo = rectangulo.calcularArea();
        System.out.println("El area del rectangulo es: "+areaRectangulo);
        Circulo circulo = new Circulo(2);
        float areaCirculo = circulo.calcularArea();
        System.out.println("El area del circulo es: "+ areaCirculo);


        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Lara",20,"25652354"));
        personas.add(new Persona("TAMITA", 50,"52635415"));
        personas.add(new Persona("Facundo", 25, "52625859"));
        personas.add(new Persona("Cristian", 30, "52615245"));

        Collections.sort(personas);;
        System.out.println("Lista de Personas:");
        for (Persona persona: personas) {
            System.out.println(persona);
        }

        Perro perro = new Perro ("Pura",7,12,"beagle");
        Perro perro2 = new Perro("California",3,30,"Pastro Belga");
        Gato gato = new Gato("Oreo",1,2,"Oreo","Corto");
        Gato gato2 = new Gato("Roma",4,4,"Negro","Corto");
        ArrayList <Animal> listAnimal = new ArrayList<>();
        listAnimal.add(perro);
        listAnimal.add(perro2);
        listAnimal.add(gato);
        listAnimal.add(gato2);

        Collections.sort(listAnimal);
        System.out.println("Lista de Animales: ");
        for(Animal animal : listAnimal){
            System.out.println(animal);
        }
        Gerente gerente = new Gerente("Tamara", 25,"25652369",25000,"Zapatillas");
        Gerente gerente1 = new Gerente("Julian", 56, "526524158", 20000,"Computadoras");
        Secretario secretario = new Secretario("Tomas", 58, "85965454", 10000,3);
        Secretario secretario1 = new Secretario("Joaquina", 45, "52641524", 5000,5);
        ArrayList<Empleado>lisEmpleado= new ArrayList<>();
        lisEmpleado.add(gerente);
        lisEmpleado.add(gerente1);
        lisEmpleado.add(secretario);
        lisEmpleado.add(secretario1);

        for (Empleado empleado : lisEmpleado){
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario: " + empleado.getSalario());
            System.out.println("Bonificacion: " +empleado.calcularBonificacion());
        }

    }
}