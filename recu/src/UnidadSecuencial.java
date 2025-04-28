public class UnidadSecuencial extends Unidad {
    public UnidadSecuencial() {
        super();
    }

    @Override
    public double getPuntaje() {
        double suma = 0;
        for (ElementoEvaluacion e : elementos) {
            suma += e.getPuntaje();
        }
        return suma;
    }

    @Override
    public double getTiempoEstimado(){
        double suma =0;
        for(ElementoEvaluacion e:elementos){
            suma=+e.getTiempoEstimado();
        }
        return suma;
    }

}

