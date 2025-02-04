package c3_actividadItegradora;

import java.util.Scanner;

public class IntegradorCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero1");
        int inputNumber = scanner.nextInt();
        System.out.println("Ingresa un numero2");
        int inputNumber2 = scanner.nextInt();

        System.out.println("\n 1 suma\n 2 resta\n 3 multiplicacion\n 4 division\n");
/*        System.out.println("""
                1 suma 2 resta 3 multiplicacion 4 division
                 """);*/
        int inputOperation = scanner.nextInt();
        int result = 0;


        switch (inputOperation) {
            case 1:
                result = inputNumber + inputNumber2;
                break;
            case 2:
                result = inputNumber - inputNumber2;
                break;
            case 3:
                result = inputNumber * inputNumber2;
                break;
            case 4:
                result = inputNumber / inputNumber2;
                break;
            default:
                try {
                    String resulDefault = "Ingrese un opc ";
                    System.out.println(resulDefault);
                    throw new RuntimeException("resulDefault");

                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    System.out.println("........");
                    e.printStackTrace();
                }

                //
        }

        System.out.println("El resultado es : " + result);

    }
}
