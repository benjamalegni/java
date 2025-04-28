import java.util.ArrayList;

public interface ElementoEvaluacion {
    double getPuntaje();
    double getTiempoEstimado();
    ArrayList<String> getConceptos();
    ArrayList<Pregunta> buscar(Condicion condicion);
}
