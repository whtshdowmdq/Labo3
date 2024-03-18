//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creacion de libros
        Libro libro1 = new Libro("Harry potter y el Caliz de fuego","J.K.Rowling");
        Libro libro2 = new Libro("El señor de los Anillos y Las Dos Torres","J.R.R. Tolkien");

        //Creacion de Usuarios
        Usuario usuario1 = new Usuario("Facundo");
        Usuario usuario2 = new Usuario("Pepito");

        //Creacion de Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        //Agregar libro a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        //Agregar usuario a la biblioteca
        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarUsuario(usuario2);

        //Mostrar libros disponibles
        biblioteca.mostrarLibrosBibliotecas();

        //Prestar Libros
        biblioteca.realizarPrestamo("Harry potter y el Caliz de fuego",usuario1);


    }
}