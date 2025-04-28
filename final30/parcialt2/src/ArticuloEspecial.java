public class ArticuloEspecial extends Articulo{
    private int peso;
    private double precioEspecial;
    private Condicion c;

    public ArticuloEspecial(String nombre, String descripcion, int peso, double precio, int nroUnidades, double precioEspecial, Condicion c){
        super(nombre, descripcion, peso, precio);
        this.peso = peso;
        this.precioEspecial = precioEspecial;
        this.c=c;
    }

    public double getPrecio(){
        return ((c.cumple(this)?precioEspecial:super.getPrecio()));
    }
}
