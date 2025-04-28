public class ColeccionSecuencial extends Coleccion{

    public ColeccionSecuencial(){
        super();
    }

    @Override
    public double getPuntajePopularidad(){
        double suma=0;
        for(ElementoBiblioteca e:elementos){
            suma+=e.getPuntajePopularidad();
        }
        return suma;
    }

    @Override
    public double getTiempoEstimado(){
        double suma=0;
        for(ElementoBiblioteca e:elementos){
            suma+=e.getTiempoEstimado();
        }
        return suma;
    }
}
