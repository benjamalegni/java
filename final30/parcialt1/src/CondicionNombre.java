public class CondicionNombre implements Condicion{
    private String nombre;

    public CondicionNombre(String nombre){
        this.nombre=nombre;
    }

    @Override
    public boolean cumple(ElementoColeccionable e){
        return e.getNombre().equals(nombre);
    }
}
