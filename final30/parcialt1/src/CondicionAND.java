public class CondicionAND implements Condicion{
    private Condicion c1,c2;

    public CondicionAND(Condicion c1, Condicion c2){
        this.c1=c1;
        this.c2=c2;
    }

    public boolean cumple(ElementoColeccionable e){
        return c1.cumple(e) && c2.cumple(e);
    }
}
