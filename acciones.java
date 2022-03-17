import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 * Autor: Ana Escobar (20489) y Juan Gonzalez-Campo (21077)
 * Descripcion: Acciones que puede tomar el usuario
 */
public class acciones {
    Scanner scan = new Scanner(System.in);
    boolean on = true;
    String b;
    /**
     * Permite agregar una carta a la coleccion del usuario
     * @param a el mapa All
     * @param c la colección del usuario
     * @param d el mapa Rep
     */
    public void agregarCarta(Map<String,String> a, ArrayList<String> c, Map<String, Integer> d){
        while(on){
            System.out.println("Ingrese el nombre de la carta a agregar");
            b = scan.nextLine();
            if (a.containsKey(b)){
                

                if (c.contains(b)){
                    int o = d.get(b)+1;
                    d.put(b, o);
                } else {
                    c.add(b);
                    d.put(b, 1);
                }
                
                System.out.println("Carta agregada");
                break;
            }
            else {
                System.out.println("Esta carta no existe");
                continue;
            }
        }
    }
    /**
     * Permite mostrar el tipo de una carta específica
     * @param a el mapa All
     */
    public void mostrarTipo(Map a){

        while (on){
            System.out.println("Ingrese el nombre de la carta a revisar");
            b = scan.nextLine();
            if (a.containsKey(b)){
                Object o;
                o =  a.get(b);
                System.out.println("Tipo: "+o);
                break;
            }
            else {
                System.out.println("Esta carta no esta en la coleccion");
                continue;
            }  
        }
    }
    /**
     * Permite imprimir todas las cartas en la colección del usuario, así como su tipo y la cantidad de cada carta
     * @param a Mapa All
     * @param c Coleccion de usuario
     * @param d Mapa Rep
     */
    public void op3(Map<String, String> a, ArrayList<String> c, Map<String, Integer> d){
        for (int i = 0; i < c.size(); i++){ 
            System.out.println(c.get(i) + " | Tipo: "+ a.get(c.get(i)) + " | Cantidad: " + d.get(c.get(i)));
        }

    }
    /**
     * Imprime todas las cartas en al colección del usuario, su tipo, cantidad de cada una y se ordena por tipo
     * @param a Mapa All
     * @param c Coleccion de usuario
     * @param d Mapa Rep
     */
    public void op4(Map<String, String> a, ArrayList<String> c, Map<String, Integer> d){
        ArrayList<String> monstruo = new ArrayList<>();
        ArrayList<String> trampa = new ArrayList<>();
        ArrayList<String> hechizo = new ArrayList<>();

        for (int i = 0; i < c.size(); i++){ 
            if (a.get(c.get(i)).equals("Monstruo")){
                monstruo.add(c.get(i));
            } if (a.get(c.get(i)).equals("Hechizo")){
                hechizo.add(c.get(i));
            }if (a.get(c.get(i)).equals("Trampa")){
                trampa.add(c.get(i));
            }
        }
        for (int i = 0; i < monstruo.size(); i++){ 
            System.out.println(monstruo.get(i) + " | Tipo: "+ a.get(monstruo.get(i)) + " | Cantidad: " + d.get(monstruo.get(i)));
        }
        for (int i = 0; i < hechizo.size(); i++){ 
            System.out.println(hechizo.get(i) + " | Tipo: "+ a.get(hechizo.get(i)) + " | Cantidad: " + d.get(hechizo.get(i)));
        }
        for (int i = 0; i < trampa.size(); i++){ 
            System.out.println(trampa.get(i) + " | Tipo: "+ a.get(trampa.get(i)) + " | Cantidad: " + d.get(trampa.get(i)));
        }

    }
    /**
     * Imprime todas las cartas existentes
     * @param a Mapa All
     */
    public void monstrarTodas(Map<String, String> a){
        for (Map.Entry entry : a.entrySet())
        {
            System.out.println("key: " + entry.getKey() + "; value: " + entry.getValue());
        }
    }
    /**
     * Muestra todas las cartas existentes, ordenadas por tipo
     * @param a Mapa All
     */
    public void mostrarOrdenados(Map<String, String> a){
        for (Map.Entry entry : a.entrySet())
        {
            if (entry.getValue().equals("Monstruo")){
                System.out.println(entry.getKey() + ":" + entry.getValue().toString());
            }
            else {
                continue;
            }
        }
        for (Map.Entry entry : a.entrySet())
        {
            if (entry.getValue().equals("Hechizo")){
                System.out.println(entry.getKey() + ":" + entry.getValue().toString());
            }
            else {
                continue;
            }
        }
        for (Map.Entry entry : a.entrySet())
        {
            if (entry.getValue().equals("Trampa")){
                System.out.println(entry.getKey() + ":" + entry.getValue().toString());
            }
            else {
                continue;
            }
        }
    }

}
