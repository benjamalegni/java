import java.util.ArrayList;
public abstract class Unidad implements ElementoEvaluacion{
    protected ArrayList<ElementoEvaluacion> elementos;

    public Unidad(){
        super();
        elementos = new ArrayList<ElementoEvaluacion>();
    }

    public ArrayList<String> getConceptos(){
        ArrayList<String> conceptos = new ArrayList<>();
        for(int i=0;i<elementos.size();i++){
            ElementoEvaluacion elemento = elementos.get(i);

            for(int j=0;j<elemento.getConceptos().size();j++){
                if(!conceptos.contains(elemento.getConceptos().get(i))){
                    conceptos.add(elemento.getConceptos().get(i));
                }
            }
        }
        return conceptos;
    }

    public void addElemento(ElementoEvaluacion elemento){
        if(!elementos.contains(elemento))
            elementos.add(elemento);
    }

    public ArrayList<Pregunta> buscar(Condicion condicion){
        ArrayList<Pregunta> aux = new ArrayList<>();
        for(int i=0;i<elementos.size();i++){
            ElementoEvaluacion elemento = elementos.get(i);
            aux.addAll(elemento.buscar(condicion));
        }
        return aux;
    }

    public ArrayList<Pregunta> buscar(Condicion condicion, Comparator comparator){
        ArrayList<Pregunta> aux = buscar(condicion);
        Collections.sort(aux,comparator);
        return aux;
    }

}
