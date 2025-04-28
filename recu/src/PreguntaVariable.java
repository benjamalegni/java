public class PreguntaVariable extends Pregunta{
    private int divisor;

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public PreguntaVariable(double puntaje, String enunciado, double tiempoEstimado, int divisor){
        super(puntaje, enunciado, tiempoEstimado);
        this.divisor=divisor;
    }

    @Override
    public double getTiempoEstimado(){
        return super.getTiempoEstimado()*this.getConceptos().size()/divisor;
    }
}
