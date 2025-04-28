public abstract class ElementoColeccionable {
    private String nombre;

    public ElementoColeccionable(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPrecio();
    public abstract int cantidadFiguritas();
    public abstract Figurita getFiguritaMayorValor();
    public abstract ElementoColeccionable getCopia(Condicion c);
}
