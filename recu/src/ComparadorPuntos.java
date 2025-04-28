import java.util.Comparator;

public class ComparadorPuntos implements Comparator<Pregunta> {
    @Override
    public int compare(Pregunta p1, Pregunta p2){
       if(p1.getPuntaje()>p2.getPuntaje()) {
           return 1;
       }else if (p1.getPuntaje()<p2.getPuntaje()){
           return -1;
       }else{
           return 0;
       }
    }
}
