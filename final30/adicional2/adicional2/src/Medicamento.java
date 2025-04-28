import java.util.ArrayList;
import java.util.Locale;

public class Medicamento {
    private String nombre;
    private String laboratorio;
    private int precio;
    private ArrayList<String> sintomas;

    public Medicamento(String nombre, String laboratorio, int precio){
        this.nombre=nombre;
        this.laboratorio=laboratorio;
        this.precio=precio;
        sintomas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean trataSintoma(String s){
        return sintomas.contains(s.toUpperCase());
    }

    public void addSintoma(String s){
        sintomas.add(s.toUpperCase());
    }

    public void removeSintoma(String s){
        sintomas.remove(s.toUpperCase());
    }

    public boolean equals(Medicamento o){
        return o.getLaboratorio().toLowerCase().equalsIgnoreCase(o.getLaboratorio()) && getNombre().toLowerCase().equals(o.getNombre().toLowerCase());
    }

}
