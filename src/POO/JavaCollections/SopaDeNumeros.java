package POO.JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SopaDeNumeros {


    public static ArrayList<Integer> getValores() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        Integer numero = 0;
        do {
            System.out.println("Ingresa un numero");
            numero = scanner.nextInt();
            if (numero != -99) numeros.add(numero);

        } while (numero != -99);

        return numeros;
    }

    public static int sumar(ArrayList<Integer> numeroASumar) {
        int sumatoria = 0;
        Iterator<Integer> iterator = numeroASumar.iterator();

        while (iterator.hasNext()) {
            sumatoria += iterator.next();
        }

        return sumatoria;
    }

    public static double calcularPromedio(ArrayList<Integer> numeros) {

        double promedio = 0;
        promedio = sumar(numeros) / numeros.size();

        return promedio;
    }

    public static void mostrarResultados(ArrayList<Integer> numerosIngresados, Integer sumatoria, double promedio) {

        Iterator<Integer> iterador = numerosIngresados.iterator();

        System.out.println("numeros ingresados son:");
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }


        System.out.println("\t La sumatoria es: " + sumatoria);
        System.out.println("\t El promedio es: " + promedio);

    }
}
