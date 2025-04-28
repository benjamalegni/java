public class UnidadSecuencialRestrictiva extends UnidadSecuencial{
    private double limite;

    public UnidadSecuencialRestrictiva(double limite){
        super();
        this.limite=limite;
    }


    @Override
    public double getPuntaje(){
        double suma=0;
        for(ElementoEvaluacion e:elementos){
            if(e.getPuntaje()<=limite){
                suma+=e.getPuntaje();
            }
        }
        return suma;
    }

}
