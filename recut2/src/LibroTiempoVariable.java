public class LibroTiempoVariable extends Libro{
    private double divisor;

    public LibroTiempoVariable(String titulo, double puntajePopularidad, double tiempoEstimado, double divisor) {
        super(titulo, puntajePopularidad, tiempoEstimado);
        this.divisor = divisor;
    }

    @Override
    public double getTiempoEstimado(){
        double tiempo= super.getTiempoEstimado();

        return (tiempo*this.getGeneros().size()/divisor);
    }
}
