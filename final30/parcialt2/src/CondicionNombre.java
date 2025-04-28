public class CondicionNombre implements Condicion {
    private String nombre;

    public boolean cumple(Articulo a){
        return a.getNombre().equals(nombre);
    }
}
