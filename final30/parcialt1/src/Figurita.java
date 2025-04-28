public class Figurita extends ElementoColeccionable{
    protected String marca;
    protected String album;
    protected int numero;
    private double precio;

    public Figurita(String nombre, String marca, String album, int numero, double precio) {
        super(nombre);
        this.marca = marca;
        this.album = album;
        this.numero = numero;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPrecio(double precio) {
        this.precio=precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int cantidadFiguritas() {
        return 1;
    }

    public Figurita getFiguritaMayorValor() {
        return this;
    }

    @Override
    public ElementoColeccionable getCopia(Condicion c) {
        return((c.cumple(this)?new Figurita(super.getNombre(), this.marca,  this.album,  this.numero,  this.precio): null));
    }
}
