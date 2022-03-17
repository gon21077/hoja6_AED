import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.plaf.TextUI;

/**
 * Autor: Ana Escobar (20489) y Juan Gonzalez-Campo (21077)
 * Descripcion: Patron de diseño que permite crear instancias de objetos que comparten una interfaz
 */
public class Main {
    
    static String path = "cards_desc.txt"; //Path del archivo
    static String line = null; // linea leida del archivo
    static Map<String, String> all;  //todas las cartas
    static Map<String,Integer> rep; //cartas repetidas
    static ArrayList<String> user = new ArrayList<>(); // Cartas del usuario
    /**
     * Lee el archivo y sus datos en el mapa All
     */
    public static void leerArchivo(){
        try {
            /**
             * Mientras haya un archivo, se lee.
             */
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while((line = reader.readLine()) != null){
                String[] line1;
                line = line.replace("|", "@");
                line1 = line.split("@");
                all.put(line1[0], line1[1]);
            }
        } catch(Exception e){
            System.out.println("Error al leer archivo");
        }
    }

    public static void main(String[] args){
        //instacias utiles
        Factory<String,String> factory = new Factory<>();
        acciones ac = new acciones();
        Scanner sc = new Scanner(System.in);
        int menu = 1; 

        System.out.println("¡Bienvenido!");
        System.out.println("Las implementaciones de MAP con las que contamos para que pueda leer sus cartas son:\n");
        System.out.println("1.HashMap\n2.TreeMap\n3.LinkedHashMap");
        System.out.println("Ingrese el numero de la implementación de MAP que desea utilizar : ");
        int num = sc.nextInt();


        //factory:
        all = factory.genMap(num);
        rep = factory.genCantMap(num);

        leerArchivo();


        while(menu != 0) {
            //desplegar menu de opciones
            System.out.println("1.Agregar una carta a la coleccion\n2.Mostrar el tipo de carta especifica\n3.Mostrar el nombre, tipo y cantidad de cada carta en colección\n4.Mostrar el nombre, tipo y cantidad de cada carta en colección de manera ordenada " +
                    "\n5.Mostrar el nombre y tipo de todas las cartas existentes\n6.Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo\n7." +
                    "Salir");
            int opc = sc.nextInt();
            switch (opc) {
                case 1://agregar cartas
                    ac.agregarCarta(all, user, rep);
                    break;
                case 2://mostrar el tipo de carta indicada por el nombre
                    ac.mostrarTipo(all);
                    break;
                case 3: //muestra el nombre, tipo y cantidad todas las cartas del usuario
                    ac.op3(all, user, rep);
                    break;
                case 4: //muestra  el nombre, tipo y cantidad de una carta en orden
                    ac.op4(all, user, rep);
                    break;
                case 5: //muestra todas las cartas
                    ac.monstrarTodas(all);
                    break;
                case 6: // muestra todas las cartas de manera ordenada
                    ac.mostrarOrdenados(all);
                    break;
                case 7: 
                    menu = 0;
                    break;
            }
        }
    }

}
