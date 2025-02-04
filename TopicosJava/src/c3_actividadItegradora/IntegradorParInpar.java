package c3_actividadItegradora;

import java.util.Scanner;

public class IntegradorParInpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int inputNumber =scanner.nextInt();

        String result= inputNumber%2==0? "El numero es par":"El numero es Inpar";
        System.out.println(result);
    }
}
