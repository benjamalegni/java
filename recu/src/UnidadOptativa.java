public class UnidadOptativa extends Unidad{
    public UnidadOptativa(){
        super();
    }

    @Override
    public double getPuntaje(){
        double puntaje = 0;

        for(ElementoEvaluacion e:elementos){
            if(e.getPuntaje()>puntaje){
                puntaje=e.getPuntaje();
            }
        }
        return puntaje;
    }

    @Override
    public double getTiempoEstimado(){
        double mayorTiempo = 0;
        for(ElementoEvaluacion e:elementos){
            if(e.getTiempoEstimado()>mayorTiempo){
                mayorTiempo=e.getTiempoEstimado();
            }
        }
        return mayorTiempo;
    }
}
