import java.util.ArrayList;
import java.util.List;

//Atributos: un arreglo o lista (según prefieras manejarlo sin usar
//colecciones) para almacenar objetos de tipo Libro y Usuario.
public class Biblioteca {
    private  List <Libro> libros;
    private List <Usuario> usuarios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    public void agregarLibro(Libro libro){
        libros.add(libro);

    }
    public void agregarUsuario (Usuario usuario){
        usuarios.add(usuario);

    }
    public void mostrarLibrosBibliotecas(){
        for(int i = 0; i < libros.size();i++){
            Libro libro = libros.get(i);
            if(libro.isDisponible()){
                System.out.println(libro.getTitulo());
            }
        }
    }
    public void realizarPrestamo(String tituloLibro, Usuario usuario){
        for(int i= 0;i < libros.size();i++){
            Libro libro = libros.get(i);

            if(libro.getTitulo().equals(tituloLibro) && libro.isDisponible()){
                libro.setDisponible(false);
                System.out.println("El libro '" +tituloLibro +"' ha sido prestado a " +usuario.getNombre());
                return;
            }
        }
        System.out.println("El libro '" +tituloLibro +"'no esta disponible en la biblioteca");
    }
}
