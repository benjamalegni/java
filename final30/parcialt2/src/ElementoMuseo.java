public abstract class ElementoMuseo {
    private String nombre;
    private String descripcion;

    public ElementoMuseo(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Articulo articuloMayorValor();

    public abstract double getPrecio();
    public abstract int getCantidadElementos();
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }

    public abstract ElementoMuseo getCopia(Condicion c);
}
