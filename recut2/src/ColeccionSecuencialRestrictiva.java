public class ColeccionSecuencialRestrictiva extends ColeccionSecuencial{
    private Condicion condicion;

    public ColeccionSecuencialRestrictiva(Condicion condicion) {
        super();
        this.condicion=condicion;
    }

    @Override
    public void addElemento(ElementoBiblioteca elemento){
        if(condicion.cumple(this))
            super.addElemento(elemento);
    }

}
