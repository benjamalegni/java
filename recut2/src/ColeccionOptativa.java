public class ColeccionOptativa extends Coleccion{
    public ColeccionOptativa() {
        super();
    }

    @Override
    public double getPuntajePopularidad(){
        double mayor=-1;

        for(ElementoBiblioteca e:elementos){
            if(e.getPuntajePopularidad()>mayor)
                mayor=e.getPuntajePopularidad();
        }
        return mayor;
    }

    @Override
    public double getTiempoEstimado(){
        double mayor=-1;

        for(ElementoBiblioteca e:elementos){
            if(e.getTiempoEstimado()>mayor)
                mayor=e.getTiempoEstimado();
        }
        return mayor;
    }
}

