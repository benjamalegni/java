public class CondicionPuntos implements Condicion{
    private double puntos;

    public CondicionPuntos(double puntos){
        this.puntos=puntos;
    }

    public boolean cumple(ElementoEvaluacion e){
        return e.getPuntaje()==puntos;
    }
}
