package c6_estructurasDeControlTryCatch;

import java.awt.image.ImagingOpException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleExecptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero1");
        System.out.println("Ingrese el numero2");
        float result = 0;

        try {
            int inputNum1 = scanner.nextInt();
            int inputNum2 = scanner.nextInt();

            result = inputNum1 / inputNum2;
            System.out.println("el resultado es : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division por cero");
        } catch (InputMismatchException e) {
            System.out.println("Ingresa un numero");

        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e.getMessage());
        }

        scanner.close();


    }
}
