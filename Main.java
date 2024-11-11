import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creación de un ArrayList para colores
        List<String> listaColores = new ArrayList<>();

        // Creación mediante la clase Arrays
        String[] nombres = {"Arturo", "Daniel", "Pamela"};
        List<String> listaNombres = Arrays.asList(nombres);

        // Adición de elementos individuales
        listaColores.add("Verde");
        listaColores.add("Amarillo");

        // Construir lista a partir de otra lista
        List<String> listaElementos = new ArrayList<>(listaColores);

        // Adición de elementos a otra colección
        listaElementos.addAll(listaNombres);

        // Despliegue de elementos de la lista
        System.out.println("Lista Nombres:");
        listaNombres.forEach(System.out::println); // sacar todo los elementos de la lista

        System.out.println("\nLista Colores:");
        listaColores.forEach(System.out::println);

        System.out.println("\nLista Elementos:");
        listaElementos.forEach(System.out::println);

        // Iteración de elementos individuales con un ListIterator
        ListIterator<String> iterador1 = listaColores.listIterator(); // Devuelve todos los elementos de la lista
        System.out.println("\nRecorrido con Iterador hacia adelante:");
        while (iterador1.hasNext()) {
            System.out.println("Color: " + iterador1.next());
        }

        System.out.println("\nRecorrido con Iterador hacia atrás:");
        while (iterador1.hasPrevious()) {
            System.out.println("Color: " + iterador1.previous());
        }

        // Recorrido con Iterador y eliminación dinámica
        System.out.println("\nRecorrido con Iterador - Eliminación de 'Amarillo':");
        while (iterador1.hasNext()) {
            
            if (iterador1.next().equals("Amarillo")) {
                iterador1.remove();
            }
        }

        // Inicialización de un nuevo iterador para verificar la eliminación
        System.out.println("\nLista de colores sin el elemento 'Amarillo':");
        ListIterator<String> iterador2 = listaColores.listIterator();
        while (iterador2.hasNext()) {
            System.out.println("Elemento: " + iterador2.next());
        }

        ListIterator<String> iterador3 = listaElementos.listIterator();
        System.out.println("\n Recorrido con Iterador hacia adelante: ");
        while(iterador3.hasNext()){
            System.out.println("Elemento: "+ iterador3.next());
        }

        System.out.println("\n Recorrido con Iterador hacia atras");
        while(iterador3.hasPrevious()){
            System.out.println("Elemento: "+ iterador3.previous());
        }
        System.out.println("\n Recorrido con Iterador - Eliminación de 'Pamela':");
        while(iterador3.hasNext()){
            if (iterador3.next().equals("Pamela")) {
                iterador3.remove();
            }
        }

        System.out.println("\nLista de nombrs sin el elemnto 'Pamela': ");
        ListIterator<String> iterador4 = listaNombres.listIterator();
        while (iterador4.hasNext()){
            System.out.println("Elemento "+iterador4.next());
        }

        System.out.println("\nLista de Elementos");
        listaElementos.forEach(System.out::println);
    }
}

