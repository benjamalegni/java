import java.util.ArrayList;

public class Museo {
    private ArrayList<ElementoMuseo> elementos;

    public Museo() {}
    public boolean tieneElemento(ElementoMuseo e){
        return elementos.contains(e);
    }

    public void addElemento(ElementoMuseo e){
        if(!tieneElemento(e)){
            elementos.add(e);
        }
    }

    public void removeElemento(ElementoMuseo e){
        if(tieneElemento(e)){
            elementos.remove(e);
        }
    }

}
