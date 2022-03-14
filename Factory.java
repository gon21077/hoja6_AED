import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

/**
 * Autor: Ana Escobar (20489) y Juan Gonzalez-Campo (21077)
 * Descripcion: Patron de diseño que permite crear instancias de objetos que comparten una interfaz
 */

public class Factory<K,V> {

    //metodo para instanciar TreeMap, HashMap o LinkedMap
    public Map<K,V> genMap(int num){
        if (num == 1) {
            return new HashMap<K,V>();
        } else if (num == 2) {
            return new TreeMap<K,V>();
        } else {
            return new LinkedHashMap<K,V>();
        }
    }

    //metodo para llevar el control de la cantidad de cartas
    public Map<String, Integer> genCantMap(int num){
        if (num == 1) {
            return new HashMap<String, Integer>();
        } else if (num == 2) {
            return new TreeMap<String, Integer>();
        } else {
            return new LinkedHashMap<String, Integer>();
        }
    }
}