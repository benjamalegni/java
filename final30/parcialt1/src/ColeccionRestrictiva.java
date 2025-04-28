public class ColeccionRestrictiva extends Coleccion{
    public ColeccionRestrictiva(String nombre,double descuento){
        super(nombre,descuento);
    }

    @Override
    public ElementoColeccionable getCopia(Condicion c){
        return null;
    }
}
