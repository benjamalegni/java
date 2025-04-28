import java.util.ArrayList;
public abstract class Coleccion implements ElementoBiblioteca{
    protected ArrayList<ElementoBiblioteca> elementos;

    public Coleccion(){
        elementos = new ArrayList<>();
    }

    public boolean tieneElemento(ElementoBiblioteca elemento){
        return elementos.contains(elemento);
    }

    public void addElemento(ElementoBiblioteca e){
        if(!tieneElemento(e)){
            elementos.add(e);
        }
    }

    public void removeElemento(ElementoBiblioteca e){
        if(tieneElemento(e))
                elementos.remove(e);
    }

    public ArrayList<String> getGeneros(){
        ArrayList<String> generos = new ArrayList<>();
        for(int i=0;i<elementos.size();i++){
            ElementoBiblioteca aux = elementos.get(i);
            for(String genero: aux.getGeneros()){
                if(!generos.contains(genero)){
                    generos.add(genero);
                }
            }
        }
        return generos;

    }

}
