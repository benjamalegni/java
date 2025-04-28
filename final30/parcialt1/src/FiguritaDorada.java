public class FiguritaDorada extends Figurita{
    private int unidades;
    private double precioEspecial;
    private Condicion c;

    public FiguritaDorada(String nombre,String marca, String album, int numero, double precio,int unidades,double precioEspecial,Condicion c){
        super(nombre,marca,album,numero,precio);
        this.unidades=unidades;
        this.precioEspecial=precioEspecial;
        this.c=c;
    }

    @Override
    public double getPrecio(){
        return(c.cumple(this)?precioEspecial:super.getPrecio());
    }

}
