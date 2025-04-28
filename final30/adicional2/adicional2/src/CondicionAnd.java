public class CondicionAnd {
    private Condicion c1;
    private Condicion c2;

    public boolean cumple(Medicamento m){
        return c1.cumple(m) && c2.cumple(m);
    }
}
