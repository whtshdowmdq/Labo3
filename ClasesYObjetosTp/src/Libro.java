public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    //Constructor que inicialice el título y autor. Todos los libros son
    //creados como disponibles.

    public Libro() {

    }
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    //Métodos para obtener y establecer los valores de los atributos.
    //Incluye un método para cambiar el estado de disponibilidad.

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
