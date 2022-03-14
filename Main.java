import java.util.*;
/**
 * Autor: Ana Escobar (20489) y Juan Gonzalez-Campo (21077)
 * Descripcion: Patron de diseño que permite crear instancias de objetos que comparten una interfaz
 */
public class Main {

    public static void main(String[] args){
        //instacias utiles
        Factory<String,String> factory = new Factory<>();
        Scanner sc = new Scanner(System.in);
        Map<String, String> all;  //todas las cartas
        Map<String,Integer> rep; //cartas repetidas
        Map<String, String> user;  //cartas del usuario
        int menu = 1; 

        System.out.println("¡Bienvenido!");
        System.out.println("Las implementaciones de MAP con las que contamos para que pueda leer sus cartas son:\n");
        System.out.println("1.HashMap\n2.TreeMap\n3.LinkedHashMap");
        System.out.println("Ingrese el numero de la implementación de MAP que desea utilizar : ");
        int num = sc.nextInt();


        //factory:
        all = factory.genMap(num);
        user = factory.genMap(num);
        rep = factory.genCantMap(num);


        while(menu != 0) {
            //desplegar menu de opciones
            System.out.println("1.Agregar una carta a la coleccion\n2.Mostrar el tipo de carta especifica\n3.Mostrar el nombre, tipo y cantidad de cada carta en colección\n4.Mostrar el nombre, tipo y cantidad de cada carta en colección de manera ordenada " +
                    "\n5.Mostrar el nombre y tipo de todas las cartas existentes\n6.Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo\n7." +
                    "Salir");
            int opc = sc.nextInt();
            switch (opc) {
                case 1://agregar cartas
                    
                case 2://mostrar el tipo de carta indicada por el nombre
                    
                case 3: //muestra el nombre, tipo y cantidad de una carta
                  
                case 4: //muestra  el nombre, tipo y cantidad de una carta en orden

                case 5: //muestra todas las cartas
               
                case 6: // muestra todas las cartas de manera ordenada
            }
        }
    }
}