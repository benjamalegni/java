import java.util.ArrayList;

public class Pregunta implements ElementoEvaluacion{
    private double puntaje;
    private String enunciado;
    private double tiempoEstimado;
    private ArrayList<String> conceptos;

    public Pregunta(double puntaje, String enunciado, double tiempoEstimado){
        super();
        this.puntaje = puntaje;
        this.enunciado = enunciado;
        this.tiempoEstimado = tiempoEstimado;
        conceptos = new ArrayList<String>();
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public boolean tieneConcepto(String concepto){
        return conceptos.contains(concepto.toUpperCase());
    }

    public void addConcepto(String concepto){
        if(!tieneConcepto(concepto.toUpperCase())){
            conceptos.add(concepto.toUpperCase());
        }
    }

    public void removeConcepto(String concepto){
        if(tieneConcepto(concepto.toUpperCase())){
            conceptos.remove(concepto.toUpperCase());
        }
    }

    @Override
    public double getPuntaje() {
        return puntaje;
    }

    @Override
    public double getTiempoEstimado(){
        return tiempoEstimado;
    }

    @Override
    public ArrayList<String> getConceptos() {
        return new ArrayList<>(conceptos);
    }

    public ArrayList<Pregunta> buscar(Condicion condicion){
        ArrayList<Pregunta> aux = new ArrayList<>();
        if(condicion.cumple(this)){
            aux.add(this);
        }
        return aux;
    }

}
