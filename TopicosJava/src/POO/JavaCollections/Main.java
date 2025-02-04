package POO.JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numerosIngreados = SopaDeNumeros.getValores();
        int sumatoria = SopaDeNumeros.sumar(numerosIngreados);
        double promedio = SopaDeNumeros.calcularPromedio(numerosIngreados);
        SopaDeNumeros.mostrarResultados(numerosIngreados,sumatoria,promedio);



    }
}
