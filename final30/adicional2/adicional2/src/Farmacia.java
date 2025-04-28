import java.util.ArrayList;

public class Farmacia {
    private ArrayList<Medicamento> medicamentos;
    private String nombre;

    public Farmacia(String nombre){
        this.nombre=nombre;
        medicamentos = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;}

    public void setNombre(String n){
        nombre=n;
    }


    public void addMedicamento(Medicamento m){
        if(!medicamentos.contains(m)){
            medicamentos.add(m);
        }
    }

    public void removeMedicamento(Medicamento m){
        if(medicamentos.contains(m)){
            medicamentos.remove(m);
        }
    }
}
