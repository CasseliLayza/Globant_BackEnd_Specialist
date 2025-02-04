package c8_claseMetodosMatematicos;

import java.util.Scanner;

public class Mate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese limite inferior");
        int inputNun1 = scanner.nextInt();
        System.out.println(inputNun1);
        System.out.println("Ingrese numero2");
        int inputNun2 = scanner.nextInt();
        System.out.println(inputNun2);

        int result = 0;

        result = (int) ((Math.random()*(inputNun2-inputNun1)+inputNun1));
        //result = (int) (Math.random()*(inputNun2));

        System.out.println("Los numeros aleatorios son: "+result);


        scanner.close();
    }

}
