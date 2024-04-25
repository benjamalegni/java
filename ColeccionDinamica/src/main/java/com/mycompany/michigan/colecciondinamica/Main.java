import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Persona gonza = new Persona(123);
        //System.out.println("El dni de Gonza es: "+gonza.getDni());
        gonza.setNombre("Gonzalo");
        gonza.setApellido("PP");
        //System.out.println("El nombre de Gonza es: "+gonza.getNombre());

        Persona agustin = new Persona(456, "Agustin", "XX", LocalDate.of(2002, 12, 24));
        //System.out.println(agustin.getfNac());

        Persona martin = new Persona(587, "Martin", "PPP");

        ColeccionDinamica lista = new ColeccionDinamica();
        lista.add(gonza);
        lista.add(agustin);
        lista.add(martin);
        //lista.add("Hpola");

        System.out.println("La lista tiene "+ lista.size()+" elementos");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(((Persona)lista.get(i)).getNombre());
        }

        martin= new Persona(587, "Martin", "PPP");

        System.out.println(lista.contains(martin));

        ArrayList<String> lista2 = new ArrayList();
        lista2.add("Hola");
        lista2.remove(1);
        lista2.remove("Hola");
        lista2.indexOf("Hola"); //en que indice esta el objeto
        lista2.clear();
        lista2.get(1);
        lista2.isEmpty();
        lista2.size();
        lista2.contains("Hola");
        lista2.addAll(List.of("hola", "chau"));
        lista2.containsAll(new ArrayList<>());

        String elem = lista2.get(1);
        elem.toLowerCase();
        
    }
}