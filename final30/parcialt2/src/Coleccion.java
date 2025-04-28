import java.util.ArrayList;

public class Coleccion extends ElementoMuseo {
    private ArrayList<ElementoMuseo> elementos;
    static double topePrecio=75;
    private double adicional;

    public Coleccion(String nombre, String descripcion, double adicional){
        super(nombre, descripcion);
        elementos = new ArrayList<ElementoMuseo>();
        this.adicional = adicional;
    }

    public int getCantidadElementos(){
        int suma = 0;
        for(ElementoMuseo e:elementos){
            suma+=e.getCantidadElementos();
        }
        return suma;
    }

    public Articulo articuloMayorValor(){
        Articulo mayor = null;
        for(ElementoMuseo e:elementos){
            Articulo aux = e.articuloMayorValor();
            if(mayor==null || aux.getPrecio()>mayor.getPrecio()){
                mayor = aux;
            }
        }
        return mayor;
    }

    public ElementoMuseo getCopia(Condicion c){
        Coleccion copia = new Coleccion(this.getNombre(),this.getDescripcion(),this.adicional);
        for(ElementoMuseo e:elementos){
            if(e.getCopia(c)!=null){
                copia.elementos.add(e.getCopia(c));
            }
        }
        return copia;
    }

    public double getPrecio(){
        double suma=0;
        for(ElementoMuseo e:elementos){
            suma+=e.getPrecio();
        }

        double total = getCantidadElementos()*adicional;
        if (total>topePrecio){
            topePrecio = total;
        }

        return suma+suma*total/100;

    }


}
