public class Prestamo {
    private Usuario usuario;
    private Item item;
    private boolean finalizado;


    public Prestamo(Usuario usuario, Item item) {
        this.usuario = usuario;
        this.item = item;
        this.finalizado = false;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void finalizarPrestamo(){
        if(!finalizado){
            item.devolver();
            finalizado = true;
            System.out.println("El prestado del articulo " +item.getTitulo()+"ha sido finalizado");
        }else
        {
            System.out.println("El prestamo ya habia terminado");
        }
    }
}
