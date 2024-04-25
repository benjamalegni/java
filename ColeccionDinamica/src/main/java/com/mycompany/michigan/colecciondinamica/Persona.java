import java.lang.annotation.Inherited;
import java.time.LocalDate;

public class Persona {
    private int dni;
    private String nombre, apellido;
    private LocalDate fNac;
    private double altura;
    private double peso;

    public Persona(int dni){
        super();
        this.dni = dni;
        this.fNac = LocalDate.of(2000, 1, 1);
        this.nombre ="N";
        this.apellido="N";
        this.peso = 1;
        this.altura = 1;
    }

    public Persona(int dni, String nombre, String apellido) {
        this(dni); // siempre primera linea del constructo
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public Persona(int dni, String nombre, String apellido, LocalDate fNac) {
        this(dni,nombre,apellido);
        this.fNac = fNac;
    }

    public int getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public LocalDate getfNac() {
        return this.fNac;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setfNac(LocalDate fNac) {
        this.fNac = fNac;
    }

    public void setAltura(double altura) {
        altura = 5;
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getIMC(){
        return this.getPeso() / (this.altura*this.altura);
    }
    @Override
    public boolean equals(Object otro){
        Persona otraPersona = (Persona) otro;
        return this.getDni() == otraPersona.getDni() &&
                this.getNombre().equals(otraPersona.getNombre()) &&
                this.getApellido().equals(otraPersona.getApellido());
    }
}
