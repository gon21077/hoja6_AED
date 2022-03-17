import java.util.Map;


public class acciones {
    
    public void agregarCarta(Map a, String b, Map c){
        if (a.containsKey(b)){
            Object o;
            o =  a.get(b);
            c.put(b, o);
        }
    }
    public void mostrarTipo(Map a, String b){
        if (a.containsKey(b)){
            Object o;
            o =  a.get(b);
            System.out.println("Tipo: "+o);
        }
        else {
            System.out.println("Esta carta no esta en la coleccion");
        }
    }

}
