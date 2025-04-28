import java.util.ArrayList;
public class Libro implements ElementoBiblioteca {
    private String titulo;
    private double puntajePopularidad;
    private double tiempoEstimado;
    private ArrayList<String> generos;

    public Libro(String titulo, double puntajePopularidad, double tiempoEstimado) {
        this.titulo = titulo;
        this.puntajePopularidad = puntajePopularidad;
        this.tiempoEstimado = tiempoEstimado;
        ArrayList<String> generos = new ArrayList<String>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public double getPuntajePopularidad() {
        return puntajePopularidad;
    }

    public void setPuntajePopularidad(double puntajePopularidad) {
        this.puntajePopularidad = puntajePopularidad;
    }

    @Override
    public double getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(double tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    @Override
    public ArrayList<String> getGeneros() {
        return new ArrayList<String>(generos);
    }

    public void setGeneros(ArrayList<String> generos) {
        this.generos = generos;
    }

}

