import java.util.Comparator;

public class ComparadorAND implements Comparator<Pregunta>{
    private Comparator<Pregunta> c1;
    private Comparator<Pregunta> c2;

    public ComparadorAND(Comparator c1, Comparator c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    public int compare(Pregunta p1, Pregunta p2){
        int result = c1.compare(p1,p2);
        if(result!=0){
            return result;
        }
        return c2.compare(p1,p2);
    }
}
