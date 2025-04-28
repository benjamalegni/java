public class ColeccionPrivada extends Coleccion{
    public ColeccionPrivada(String nombre, String descripcion, double adicional) {
        super(nombre, descripcion, adicional);
    }

    public ElementoMuseo getCopia(){
        return null;
    }
}
