public class CondicionNombre extends Condicion{
    private String nombre;

    public boolean cumple(Medicamento m){
        return m.getNombre().equals(nombre);
    }
}
