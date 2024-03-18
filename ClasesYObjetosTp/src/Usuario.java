//Atributos: nombre (String), ID único (int) y contador estático para
//asignar ID automáticamente.
public class Usuario {
        private String nombre;
        private int id;
        private static int contId = 1;

//Constructor que inicialice el nombre del usuario y asigne un ID único.

    public Usuario() {
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.id = contId++;
    }
//Métodos para obtener el nombre y el ID del usuario.

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}
