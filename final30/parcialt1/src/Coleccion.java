import java.util.ArrayList;

public class Coleccion extends ElementoColeccionable {
    private ArrayList<ElementoColeccionable> elementos;
    private double descuento;
    private static double topeDescuento = 50;

    public Coleccion(String nombre, double descuento){
        super(nombre);
        this.descuento=descuento;
        elementos = new ArrayList<ElementoColeccionable>();
    }

    public double getDescuento(){
        return descuento;
    }

    public void setDescuento(double descuento){
        this.descuento=descuento;
    }

    public boolean tieneElemento(ElementoColeccionable e){
        return elementos.contains(e);
    }

    public void addElemento(ElementoColeccionable e){
        if(!elementos.contains(e))
            elementos.add(e);
    }

    public void removeElemento(ElementoColeccionable e){
        if(elementos.contains(e)){
            elementos.remove(e);
        }
    }

    // metodos de ElementoColeccionable

    public int cantidadFiguritas(){
        int cantidad = 0;
        for(ElementoColeccionable e:elementos){
            cantidad+=e.cantidadFiguritas();
        }
        return cantidad;
    }

    public double getPrecio(){
        double suma=0;
        double montoDescuento = descuento*this.cantidadFiguritas();

        for(ElementoColeccionable e:elementos){
            suma+=e.getPrecio();
        }

        if(montoDescuento>topeDescuento){
            montoDescuento=topeDescuento;
        }

        return suma-suma*montoDescuento/100;
    }

    public Figurita getFiguritaMayorValor(){
        Figurita mayor = null;

        for(int i=0;i<elementos.size();i++){
            Figurita aux = elementos.get(i).getFiguritaMayorValor();
            if(mayor==null || aux.getPrecio()>mayor.getPrecio()){
                mayor=aux;
            }
        }
        return mayor;
    }

    public ElementoColeccionable getCopia(Condicion c){
        Coleccion copia = new Coleccion(super.getNombre(), descuento);
        boolean agrego = false;

        for(ElementoColeccionable e:elementos){
            ElementoColeccionable aux = e.getCopia(c);

            if(aux!=null){
                copia.addElemento(aux);
                agrego=true;
            }
        }

        return(agrego?copia:null);
    }
}

