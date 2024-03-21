public class Item {
    private String titulo;
    private boolean reservado;
    private boolean disponible;


    public Item(java.lang.String titulo) {
        this.titulo = titulo;
        this.disponible = true;
        this.reservado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestar() {
        if (disponible && !reservado) {
            disponible = false;
            System.out.println("El item " + titulo + "ha sido prestado");
        } else {
            System.out.println("El item no esta disponible");
        }
    }

    public void reservar() {
        if (disponible && !reservado) {
            reservado = true;
            disponible = false;
            System.out.println("El titulo " + titulo + "ya fue reservado");
        } else {
            System.out.println("El titulo no esta disponible");
        }
    }

    public void devolver(){
        if(!disponible){
            disponible = true;
            reservado = false;
            System.out.println("El item ha sido devuelto");
        }else{
            System.out.println("El articulo ya esta disponible");
        }

    }
}