public class Revista extends Item{
    private int nroEdicion;

    public Revista(String titulo, int nroEdicion) {
        super(titulo);
        this.nroEdicion = nroEdicion;
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }
}
