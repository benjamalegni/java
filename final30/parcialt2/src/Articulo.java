public class Articulo extends ElementoMuseo{
    private int peso;
    private double precio;

    public Articulo(String nombre, String descripcion,int peso, double precio) {
        super(nombre, descripcion);
        this.peso = peso;
        this.precio = precio;
    }

    public Articulo articuloMayorValor() {
        return this;
    }

    public int getCantidadElementos(){
        return 1;
    }

    public ElementoMuseo getCopia(Condicion c){

        if(c.cumple(this)){
            return new Articulo(this.getNombre(),this.getDescripcion(),this.getPeso(),this.getPrecio());
        }else{
            return null;
        }
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }



    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getPrecio(){
        return precio;
    }
}
